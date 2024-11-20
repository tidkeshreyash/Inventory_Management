package com.example.demo.rowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.example.demo.model.Bill;

public class BillMapper implements RowMapper<Bill> {

	@Override
	public Bill mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		Bill bill = new Bill();
        bill.setBillId(rs.getInt("bill_id"));
        bill.setBrandId(rs.getInt("brand_id"));
        bill.setBillDate(rs.getDate("bill_date").toLocalDate());
        bill.setBrandName(rs.getString("brand_name"));
        bill.setSize(rs.getInt("size"));
        bill.setUnit(rs.getString("unit"));
        bill.setQuantityInBottles(rs.getInt("quantity_in_bottles"));
        bill.setMrp(rs.getDouble("mrp"));
        bill.setTax(rs.getDouble("tax"));
        bill.setModeOfPayment(rs.getString("mode_Of_Payment"));
        bill.setTotalAmount(rs.getDouble("total_amount"));
        return bill;
	}
	

}
