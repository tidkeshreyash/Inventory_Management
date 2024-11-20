package com.example.demo.controller;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Bill;
import com.example.demo.service.BillService;

@RestController
@RequestMapping("/Store")
@CrossOrigin(origins = "http://localhost:4200") 
public class BillController {
	@Autowired
	private BillService billService;
	
	@GetMapping("/bills/by-date/{date}")
    public ResponseEntity<List<Bill>> getBillByDate(@PathVariable String date) {
		LocalDate localDate = LocalDate.parse(date);
	    List<Bill> bills = billService.getBillByDate(localDate);
	    
	    if (bills.isEmpty()) {
	        return ResponseEntity.noContent().build(); // 204 No Content if no bills found
	    }
	    return ResponseEntity.ok(bills);
    }
	
	@GetMapping("/allBills")
    public ResponseEntity<List<Bill>> getAllBill() {
		
	    
	    
	    return new ResponseEntity<>(billService.getAllBills(),HttpStatus.OK);
    }

}
