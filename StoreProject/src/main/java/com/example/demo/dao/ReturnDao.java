package com.example.demo.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Return;
import com.example.demo.rowMapper.ReturnMapper;

@Repository
public class ReturnDao {
	
    @Autowired
    private JdbcTemplate jdbcTemplate;

	public int returnProduct(Return return1) {
		// TODO Auto-generated method stub
		String sql = "INSERT INTO return_table (return_date, brand_id, return_from, size, unit, quantity_in_bottles, mrp, total_amount,brand_name) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
		return jdbcTemplate.update(sql,return1.getReturnDate(),return1.getBrandId(),return1.getReturnFrom(),return1.getSize(),return1.getUnit(),return1.getQuantityInBottles(),return1.getMrp(),return1.getTotalAmount(), return1.getBrandName());
		
	}

	public List<Return> getAllDetails() {
		// TODO Auto-generated method stub
		String sql = "SELECT return_id, brand_id, return_date, return_from, size, unit, quantity_in_bottles, mrp, total_amount, brand_name FROM return_table;";

				
		return jdbcTemplate.query(sql, new ReturnMapper());
	}

}
