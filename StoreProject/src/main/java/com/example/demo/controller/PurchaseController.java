package com.example.demo.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Purchase;
import com.example.demo.service.PurchaseService;

@RestController
@RequestMapping("store")
@CrossOrigin(origins = "http://localhost:4200") 
public class PurchaseController {
	
	@Autowired
	private PurchaseService purchaseService;
	
	
	@PostMapping("/addPurchase")
	public ResponseEntity<Map<String, String>>addPurchase(@RequestBody Purchase purchase){
		Map<String, String> response = new HashMap<>();
		try {
			purchaseService.addPurchase(purchase);
	        response.put("message", "Purchase added successfully and inventory updated.");
		}catch(Exception e) {
			
			response.put("message", "Purchase  not added ");
		}
		
		return ResponseEntity.ok(response);
	}
	
	
	@GetMapping("/getAllPurchase")
	public ResponseEntity<List<Purchase>> getAllPurchase(){
		return new ResponseEntity<>(purchaseService.getAllPurchase(), HttpStatus.OK);
	}
	
	
	

}
