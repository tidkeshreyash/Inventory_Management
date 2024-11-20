package com.example.demo.dao;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Bill;
import com.example.demo.model.Sell;
import com.example.demo.rowMapper.BillMapper;

@Repository
public class BillDao {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;

	public int addBill(Sell sell) {
		// TODO Auto-generated method stub
		Double totalAmount = (sell.getQuantityInBottles()*sell.getMrp()) + sell.getTax();
		String sql = "INSERT INTO Bill (brand_id, bill_date, brand_name, size, unit, quantity_in_bottles, " +
                "mrp, tax, mode_Of_Payment, total_amount) " +
                "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
   return jdbcTemplate.update(sql, sell.getBrandId(), sell.getSellDate(), sell.getBrandName(), 
                              sell.getSize(), sell.getUnit(), sell.getQuantityInBottles(), sell.getMrp(),
                              sell.getTax(), sell.getModeOfPayment(), totalAmount);
	}

	public List<Bill> getBillByDate(LocalDate date) {
		// TODO Auto-generated method stub
		String sql = "SELECT bill_id, brand_id, bill_date, brand_name, size, unit, quantity_in_bottles, mrp, tax, mode_Of_Payment, total_amount FROM bill WHERE bill_date = ?";
        return jdbcTemplate.query(sql, new BillMapper(), date);
	}

	public List<Bill> getAllBills() {
		// TODO Auto-generated method stub
		String sql = "SELECT bill_id, brand_id, bill_date, brand_name, size, unit, quantity_in_bottles, mrp, tax, mode_Of_Payment, total_amount FROM bill";
		return jdbcTemplate.query(sql, new BillMapper());
	}

}
