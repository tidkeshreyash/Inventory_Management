package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Inventory;
import com.example.demo.service.InventoryService;

@RestController
@CrossOrigin(origins = "http://localhost:4200") 
public class InventoryController {
	
	@Autowired
	private InventoryService inventoryService;
	
	@GetMapping("/getInventory/{brandId}")
	public ResponseEntity<Inventory> getInventory(@PathVariable int brandId){
		return new ResponseEntity<>( inventoryService.getInventory(brandId),HttpStatus.OK);
	}
	
	@GetMapping("/getAllInventory")
	public ResponseEntity<List<Inventory>> getAllInventory(){
		return new ResponseEntity<>( inventoryService.getAllInventory(),HttpStatus.OK);
	}

}
