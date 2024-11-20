package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.InventoryDao;
import com.example.demo.dao.PurchaseDao;
import com.example.demo.model.Purchase;


@Service
public class PurchaseService {
	
	@Autowired
	private PurchaseDao purchaseDao;
	
	@Autowired
	private InventoryDao inventoryDao;

	public void addPurchase(Purchase purchase) throws Exception {
		// TODO Auto-generated method stub
		 int purchaseResult = purchaseDao.addPurchase(purchase);
	        if (purchaseResult <= 0) {
	            throw new Exception("Failed to add purchase record.");
	        }

	        // Step 2: Update inventory with the purchased quantity
	        int inventoryResult = inventoryDao.updateInventoryAfterPurchase(purchase);
	        if (inventoryResult <= 0) {
	            throw new Exception("Failed to update inventory for purchase.");
	        }
	}

	public List<Purchase> getAllPurchase() {
		// TODO Auto-generated method stub
		return purchaseDao.getAllPurchase();
	}

}
