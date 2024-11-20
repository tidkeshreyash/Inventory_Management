package com.example.demo.rowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.example.demo.model.Return;

public class ReturnMapper implements RowMapper<Return> {

	@Override
	public Return mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
	        Return returnObj = new Return();
	        returnObj.setReturnId(rs.getInt("return_id"));
	        returnObj.setBrandId(rs.getInt("brand_id"));
	        returnObj.setReturnDate(rs.getDate("return_date").toLocalDate());
	        returnObj.setReturnFrom(rs.getString("return_from"));
	        returnObj.setSize(rs.getInt("size"));
	        returnObj.setUnit(rs.getString("unit"));
	        returnObj.setQuantityInBottles(rs.getInt("quantity_in_bottles"));
	        returnObj.setMrp(rs.getDouble("mrp"));
	        returnObj.setTotalAmount(rs.getDouble("total_amount"));
	        returnObj.setBrandName(rs.getString("brand_name"));
	        return returnObj;
	    }
	}


