package com.example.demo.rowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.example.demo.model.Sell;

public class SellMapper implements RowMapper<Sell>{

	@Override
	public Sell mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		Sell sell = new Sell();
        sell.setSellDate(rs.getDate("sell_date").toLocalDate());
        sell.setBrandId(rs.getInt("brand_id"));
        sell.setQuantityInBottles(rs.getInt("quantity_in_bottles"));
        sell.setSize(rs.getInt("size"));
        sell.setUnit(rs.getString("unit"));
        sell.setBrandName(rs.getString("brand_name"));
        sell.setMrp(rs.getDouble("mrp"));
        sell.setTax(rs.getDouble("tax"));
        sell.setTotalAmount(rs.getDouble("total_amount"));
        sell.setModeOfPayment(rs.getString("mode_Of_Payment"));
        return sell;
	}

}
