package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Return;
import com.example.demo.service.ReturnService;

@RestController
@RequestMapping("Store")
@CrossOrigin(origins = "http://localhost:4200") 
public class ReturnController {
	
	@Autowired
	private ReturnService returnService;
	
	
	@PostMapping("/returnProduct")
	public ResponseEntity<String> returnProduct(@RequestBody Return return1){
		try {
			returnService.returnProduct(return1);
			return ResponseEntity.ok("Product Returned Succesfully and Inventory is updated");
		}catch(Exception e) {
			return ResponseEntity.ok("Unable to return porduct");
		}
	}
	
	
	@GetMapping("/getAllReturnProductDetails")
	public ResponseEntity<List<Return>> getAllDetails(){
		return new ResponseEntity<>(returnService.getAllDetails(), HttpStatus.OK);
	}

}
