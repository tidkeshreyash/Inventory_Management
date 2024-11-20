package com.example.demo.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Purchase;
import com.example.demo.rowMapper.PurchaseMapper;


@Repository
public class PurchaseDao {
	
	@Autowired
    private JdbcTemplate jdbcTemplate;

	public int addPurchase(Purchase purchase) {
		// TODO Auto-generated method stub
		String sql = "INSERT INTO Purchase (brand_name, brand_id, size, unit, cases, bottles, mrp, total_amount, purchase_date) " +
                "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
   return jdbcTemplate.update(sql, purchase.getBrandName(), purchase.getBrandId(), purchase.getSize(), 
                              purchase.getUnit(), purchase.getCases(), purchase.getBottles(), 
                              purchase.getMrp(), purchase.getTotalAmount(), purchase.getPurchaseDate());
	}

	public List<Purchase> getAllPurchase() {
		// TODO Auto-generated method stub
		String sql = "SELECT \r\n"
				+ "    purchase_id, \r\n"
				+ "    brand_name, \r\n"
				+ "    brand_id, \r\n"
				+ "    size, \r\n"
				+ "    unit, \r\n"
				+ "    cases, \r\n"
				+ "    bottles, \r\n"
				+ "    mrp, \r\n"
				+ "    total_amount, \r\n"
				+ "    purchase_date \r\n"
				+ "FROM \r\n"
				+ "    Purchase;\r\n";
		return jdbcTemplate.query(sql, new PurchaseMapper());
	}

	
	

    
	
	
	
	

}
