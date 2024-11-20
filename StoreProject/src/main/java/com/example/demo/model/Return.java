package com.example.demo.model;

import java.time.LocalDate;

public class Return {
	private int returnId;
    private int brandId;
    private String brandName;
    private LocalDate returnDate;
    private String returnFrom;
    private int size;
    private String unit;
    private int quantityInBottles;
    private double mrp;
    private double totalAmount;
    
    
    
    
    
    
	public String getBrandName() {
		return brandName;
	}
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}
	public int getReturnId() {
		return returnId;
	}
	public void setReturnId(int returnId) {
		this.returnId = returnId;
	}
	public int getBrandId() {
		return brandId;
	}
	public void setBrandId(int brandId) {
		this.brandId = brandId;
	}
	public LocalDate getReturnDate() {
		return returnDate;
	}
	public void setReturnDate(LocalDate returnDate) {
		this.returnDate = returnDate;
	}
	public String getReturnFrom() {
		return returnFrom;
	}
	public void setReturnFrom(String returnFrom) {
		this.returnFrom = returnFrom;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public String getUnit() {
		return unit;
	}
	public void setUnit(String unit) {
		this.unit = unit;
	}
	public int getQuantityInBottles() {
		return quantityInBottles;
	}
	public void setQuantityInBottles(int quantityInBottles) {
		this.quantityInBottles = quantityInBottles;
	}
	public double getMrp() {
		return mrp;
	}
	public void setMrp(double mrp) {
		this.mrp = mrp;
	}
	public double getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}
	public Return(int returnId, int brandId, LocalDate returnDate, String returnFrom, int size, String unit,
			int quantityInBottles, double mrp, double totalAmount) {
		super();
		this.returnId = returnId;
		this.brandId = brandId;
		this.returnDate = returnDate;
		this.returnFrom = returnFrom;
		this.size = size;
		this.unit = unit;
		this.quantityInBottles = quantityInBottles;
		this.mrp = mrp;
		this.totalAmount = totalAmount;
	}
	public Return() {
		super();
		// TODO Auto-generated constructor stub
	}
    
    

}
