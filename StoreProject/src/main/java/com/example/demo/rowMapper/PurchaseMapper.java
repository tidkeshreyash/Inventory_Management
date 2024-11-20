package com.example.demo.rowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.LocalDate;

import org.springframework.jdbc.core.RowMapper;

import com.example.demo.model.Purchase;

public class PurchaseMapper implements RowMapper<Purchase> {

	@Override
	public Purchase mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		Purchase purchase = new Purchase();
        purchase.setPurchaseId(rs.getInt("purchase_id"));
        purchase.setBrandName(rs.getString("brand_name"));
        purchase.setBrandId(rs.getInt("brand_id"));
        purchase.setSize(rs.getInt("size"));
        purchase.setUnit(rs.getString("unit"));
        purchase.setCases(rs.getInt("cases"));
        purchase.setBottles(rs.getInt("bottles"));
        purchase.setMrp(rs.getDouble("mrp"));
        purchase.setTotalAmount(rs.getDouble("total_amount"));
        
        LocalDate purchaseDate = rs.getDate("purchase_date").toLocalDate();
        purchase.setPurchaseDate(purchaseDate);
        return purchase;
		
	}

}
