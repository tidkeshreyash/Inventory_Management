package com.example.demo.model;

public class Inventory {
	private int brandId;
    private String brandName;
    private int size;
    private String unit;
    private int cases;
    private int bottles;
    private double mrp;
    private double totalAmount;
	public int getBrandId() {
		return brandId;
	}
	public void setBrandId(int brandId) {
		this.brandId = brandId;
	}
	public String getBrandName() {
		return brandName;
	}
	public void setBrandName(String brandName) {
		this.brandName = brandName;
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
	public Inventory(int brandId, String brandName, int size, String unit, int cases, int bottles, double mrp,
			double totalAmount) {
		super();
		this.brandId = brandId;
		this.brandName = brandName;
		this.size = size;
		this.unit = unit;
		this.cases = cases;
		this.bottles = bottles;
		this.mrp = mrp;
		this.totalAmount = totalAmount;
	}
	public Inventory() {
		super();
		// TODO Auto-generated constructor stub
	}
    
    

}
