package com.example.demo.model;

import java.time.LocalDate;

public class Purchase {
	private int purchaseId;
    private String brandName;
    private int brandId;
    private int size;
    private String unit;
    private int cases;
    private int bottles;
    private double mrp;
    private double totalAmount;
    private LocalDate purchaseDate;
	public int getPurchaseId() {
		return purchaseId;
	}
	public void setPurchaseId(int purchaseId) {
		this.purchaseId = purchaseId;
	}
	public String getBrandName() {
		return brandName;
	}
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}
	public int getBrandId() {
		return brandId;
	}
	public void setBrandId(int brandId) {
		this.brandId = brandId;
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
	public int getCases() {
		return cases;
	}
	public void setCases(int cases) {
		this.cases = cases;
	}
	public int getBottles() {
		return bottles;
	}
	public void setBottles(int bottles) {
		this.bottles = bottles;
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
	public LocalDate getPurchaseDate() {
		return purchaseDate;
	}
	public void setPurchaseDate(LocalDate purchaseDate) {
		this.purchaseDate = purchaseDate;
	}
	public Purchase(int purchaseId, String brandName, int brandId, int size, String unit, int cases, int bottles,
			double mrp, double totalAmount, LocalDate purchaseDate) {
		super();
		this.purchaseId = purchaseId;
		this.brandName = brandName;
		this.brandId = brandId;
		this.size = size;
		this.unit = unit;
		this.cases = cases;
		this.bottles = bottles;
		this.mrp = mrp;
		this.totalAmount = totalAmount;
		this.purchaseDate = purchaseDate;
	}
	public Purchase() {
		super();
		// TODO Auto-generated constructor stub
	}
    
    

}
