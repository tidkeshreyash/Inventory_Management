package com.example.demo.rowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.example.demo.model.Inventory;


public class InventoryMapper implements RowMapper<Inventory> {

	@Override
	public Inventory mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		Inventory inventory = new Inventory();
		
		inventory.setBrandId(rs.getInt("brand_id"));
		inventory.setBrandName(rs.getString("brand_name"));
		inventory.setSize(rs.getInt("size"));
		inventory.setUnit(rs.getString("unit"));
		inventory.setCases(rs.getInt("cases"));
		inventory.setMrp(rs.getDouble("mrp"));
		inventory.setBottles(rs.getInt("bottles"));
		return inventory;
	}
}
