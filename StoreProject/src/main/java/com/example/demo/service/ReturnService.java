package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.InventoryDao;
import com.example.demo.dao.ReturnDao;
import com.example.demo.model.Return;

@Service
public class ReturnService {
	
	@Autowired
	private ReturnDao returnDao;
	
	@Autowired
	private InventoryDao inventoryDao;

	public void returnProduct(Return return1) {
		// TODO Auto-generated method stub
		returnDao.returnProduct(return1);
		
		inventoryDao.updateInventoryAfterReturn(return1);
		
		
	}

	public List<Return> getAllDetails() {
		// TODO Auto-generated method stub
		return returnDao.getAllDetails();
	}

}
