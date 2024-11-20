package com.example.demo.dao;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Sell;
import com.example.demo.rowMapper.SellMapper;


@Repository
public class SellDao {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	

	public int addSell(Sell sell) {
		// TODO Auto-generated method stub
		 String sql = "INSERT INTO Sell (sell_date, brand_id, quantity_in_bottles, size, mrp, tax, total_amount, brand_name, unit, mode_of_payment) " +
                 "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
    return jdbcTemplate.update(sql,
        sell.getSellDate(),
        sell.getBrandId(),
        sell.getQuantityInBottles(),
        sell.getSize(),
        sell.getMrp(),
        sell.getTax(),
        sell.getTotalAmount(),
        sell.getBrandName(),
        sell.getUnit(),
        sell.getModeOfPayment()
    );
		
	}

	public boolean checkSell(int brandId, LocalDate date) {
		// TODO Auto-generated method stub
		String sql = "SELECT COUNT(*) FROM sell WHERE brand_id = ? AND sell_date=?";
		int count = jdbcTemplate.queryForObject(sql, Integer.class,brandId,date);
		return count != 0 && count > 0;
	}

	public int updateSell(Sell sell) {
		// TODO Auto-generated method stub
		
		String sql = "UPDATE sell SET quantity_in_bottles = quantity_in_bottles + ?, total_amount = total_amount + ? WHERE brand_id = ? AND sell_date = ?";
		return jdbcTemplate.update(sql,sell.getQuantityInBottles(),sell.getTotalAmount(),sell.getBrandId(),sell.getSellDate());
		
	}

	public List<Sell> getAllSell() {
		// TODO Auto-generated method stub
		String sql = "SELECT sell_date, brand_id, quantity_in_bottles, size, unit, brand_name, mrp, tax, total_amount, mode_Of_Payment FROM sell;";

		return jdbcTemplate.query(sql, new SellMapper());
	}

	

}
