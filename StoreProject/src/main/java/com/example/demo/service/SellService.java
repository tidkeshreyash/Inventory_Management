package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.BillDao;
import com.example.demo.dao.InventoryDao;
import com.example.demo.dao.SellDao;
import com.example.demo.model.Sell;


@Service
public class SellService {
	
	@Autowired
	private SellDao sellDao;
	
	@Autowired
	private InventoryDao inventoryDao;
	
	@Autowired
	private BillDao billDao;

	public void addSell(Sell sell) throws Exception {
		
		boolean chechSellExits = sellDao.checkSell(sell.getBrandId(), sell.getSellDate());
		if(chechSellExits) {
			sellDao.updateSell(sell);
		}else {
			sellDao.addSell(sell);
		}
		
		int inventoryResult = inventoryDao.updateInventoryAfterSell(sell);
        if (inventoryResult <= 0) {
            throw new Exception("Failed to update inventory after sale.");
        }

       
        int billResult = billDao.addBill(sell);
        if (billResult <= 0) {
            throw new Exception("Failed to create bill record.");
        }

	}

	public List<Sell> getAllSell() {
		// TODO Auto-generated method stub
		return sellDao.getAllSell();
	}

}
