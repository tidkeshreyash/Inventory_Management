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

import com.example.demo.model.Sell;
import com.example.demo.service.SellService;

@RestController
@RequestMapping("/Store")
@CrossOrigin(origins = "http://localhost:4200") 
public class SellController {
	
	@Autowired
	private SellService sellService;
	
	
	@PostMapping("/addSell")
	public ResponseEntity<String> addSell(@RequestBody Sell sell){
		try {
			sellService.addSell(sell);
			return ResponseEntity.ok("Sell and Bill added Successfully");
		}catch(Exception e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body("Error: " + e.getMessage());
		}
	}
	
	@GetMapping("/getAllSell")
	public ResponseEntity<List<Sell>> getAllSell(){
		return new ResponseEntity<>(sellService.getAllSell(), HttpStatus.OK);
	}

}
