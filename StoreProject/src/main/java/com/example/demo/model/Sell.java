package com.example.demo.model;

import java.time.LocalDate;

public class Sell {
	private int sellId;
    private LocalDate sellDate;
    private int brandId;
    private String brandName;
    private String unit;
	private int quantityInBottles;
    private int size;
    private double mrp;
    private double tax;
    private double totalAmount;
    private String modeOfPayment;
    
    
    
    public String getModeOfPayment() {
		return modeOfPayment;
	}
	public void setModeOfPayment(String modeOfPayment) {
		this.modeOfPayment = modeOfPayment;
	}
	public String getUnit() {
		return unit;
	}
	public void setUnit(String unit) {
		this.unit = unit;
	}
	public String getBrandName() {
		return brandName;
	}
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}
	
	public int getSellId() {
		return sellId;
	}
	public void setSellId(int sellId) {
		this.sellId = sellId;
	}
	public LocalDate getSellDate() {
		return sellDate;
	}
	public void setSellDate(LocalDate sellDate) {
		this.sellDate = sellDate;
	}
	public int getBrandId() {
		return brandId;
	}
	public void setBrandId(int brandId) {
		this.brandId = brandId;
	}
	public int getQuantityInBottles() {
		return quantityInBottles;
	}
	public void setQuantityInBottles(int quantityInBottles) {
		this.quantityInBottles = quantityInBottles;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public double getMrp() {
		return mrp;
	}
	public void setMrp(double mrp) {
		this.mrp = mrp;
	}
	public double getTax() {
		return tax;
	}
	public void setTax(double tax) {
		this.tax = tax;
	}
	public double getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}
	public Sell(int sellId, LocalDate sellDate, int brandId, int quantityInBottles, int size, double mrp, double tax,
			double totalAmount) {
		super();
		this.sellId = sellId;
		this.sellDate = sellDate;
		this.brandId = brandId;
		this.quantityInBottles = quantityInBottles;
		this.size = size;
		this.mrp = mrp;
		this.tax = tax;
		this.totalAmount = totalAmount;
	}
	public Sell() {
		super();
		// TODO Auto-generated constructor stub
	}
    
    

}
