package com.example.demo.service;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.InventoryDao;
import com.example.demo.model.Inventory;


@Service
public class InventoryService {
	
	@Autowired
	private InventoryDao inventoryDao;

	public Inventory getInventory(int brandId) {
		// TODO Auto-generated method stub
		return inventoryDao.getInventoryById(brandId);
	}

	public List<Inventory> getAllInventory() {
		// TODO Auto-generated method stub
		return inventoryDao.getAllInventory();
	}

}
