package com.example.demo.service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.BillDao;
import com.example.demo.model.Bill;

@Service
public class BillService {
	
	@Autowired
	private BillDao billDao;

	public List<Bill> getBillByDate(LocalDate date) {
		// TODO Auto-generated method stub
		return billDao.getBillByDate(date);
	}

	public List<Bill> getAllBills() {
		// TODO Auto-generated method stub
		return billDao.getAllBills();
	}

}
