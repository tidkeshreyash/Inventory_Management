package com.example.demo.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Inventory;
import com.example.demo.model.Purchase;
import com.example.demo.model.Return;
import com.example.demo.model.Sell;
import com.example.demo.rowMapper.InventoryMapper;


@Repository
public class InventoryDao {
	
	    @Autowired
	    private JdbcTemplate jdbcTemplate;

	    public boolean brandExists(int brandId) {
	        String sql = "SELECT COUNT(*) FROM inventory WHERE brand_id = ?";
	        Integer count = jdbcTemplate.queryForObject(sql, Integer.class, brandId);
	        return count != null && count > 0;
	    }

	    

	public int updateInventoryAfterPurchase(Purchase purchase) {
		// TODO Auto-generated method stub
		if (brandExists(purchase.getBrandId())) {
           
            String updateSql = "UPDATE inventory SET cases = cases + ?, bottles = bottles + ? WHERE brand_id = ?";
            return jdbcTemplate.update(updateSql, purchase.getCases(), purchase.getBottles(), purchase.getBrandId());
        } else {
           
            String insertSql = "INSERT INTO inventory (brand_id, brand_name, size, unit, cases, bottles, mrp) " +
                               "VALUES (?, ?, ?, ?, ?, ?, ?)";
            return jdbcTemplate.update(insertSql, purchase.getBrandId(), purchase.getBrandName(), purchase.getSize(), 
                                       purchase.getUnit(), purchase.getCases(), purchase.getBottles(), 
                                       purchase.getMrp());
        }
	}



	public int updateInventoryAfterSell(Sell sell) {
		
		
		String fetchSql = "SELECT bottles FROM inventory WHERE brand_id = ?";
	    int currentBottles = jdbcTemplate.queryForObject(fetchSql,Integer.class,sell.getBrandId());
		
		
		        String sql = "UPDATE inventory SET bottles = bottles - ?, cases = ? WHERE brand_id = ?";
		        int bottlesSold = sell.getQuantityInBottles();
		        int remainingBottles = currentBottles - bottlesSold;
		        int remainingCases = remainingBottles / 12;
		        return jdbcTemplate.update(sql, bottlesSold, remainingCases, sell.getBrandId());
		  
	}



	public int updateInventoryAfterReturn(Return return1) {
		// TODO Auto-generated method stub
		String fetchSql = "SELECT bottles FROM inventory WHERE brand_id = ?";
	    int currentBottles = jdbcTemplate.queryForObject(fetchSql,Integer.class,return1.getBrandId());
		
		
		        String sql = "UPDATE inventory SET bottles = bottles + ?, cases = ? WHERE brand_id = ?";
		        int bottlesGot = return1.getQuantityInBottles();
		        int remainingBottles = currentBottles + bottlesGot;
		        int remainingCases = remainingBottles / 12;
		        return jdbcTemplate.update(sql, bottlesGot, remainingCases, return1.getBrandId());
		
		
	}



	public Inventory getInventoryById(int brandId) {
		// TODO Auto-generated method stub
		String sql  = "SELECT brand_id,brand_name,size,unit,cases,bottles,mrp FROM inventory WHERE brand_id = ?";
		List<Inventory> inventoryList = jdbcTemplate.query(sql, new InventoryMapper(), brandId);
	    
	    // Return the first element from the list (assuming there is only one match for brand_id)
	    if (!inventoryList.isEmpty()) {
	        return inventoryList.get(0);
	    } else {
	        return null; // No result found
	    }
	}



	public List<Inventory> getAllInventory() {
		// TODO Auto-generated method stub
		String sql  = "SELECT brand_id,brand_name,size,unit,cases,bottles,mrp FROM inventory";
		return jdbcTemplate.query(sql, new InventoryMapper());
	}
	
	

	

}
