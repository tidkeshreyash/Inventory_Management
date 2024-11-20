package com.example.demo.model;

import java.time.LocalDate;

public class Bill {
	 private int billId;
	    private int brandId;
	    private LocalDate billDate;
	    private String brandName;
	    private int size;
	    private String unit;
	    private int quantityInBottles;
	    private double mrp;
	    private double tax;
	    private String modeOfPayment;
	    private double totalAmount;
		public int getBillId() {
			return billId;
		}
		public void setBillId(int billId) {
			this.billId = billId;
		}
		public int getBrandId() {
			return brandId;
		}
		public void setBrandId(int brandId) {
			this.brandId = brandId;
		}
		public LocalDate getBillDate() {
			return billDate;
		}
		public void setBillDate(LocalDate billDate) {
			this.billDate = billDate;
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
		public double getTax() {
			return tax;
		}
		public void setTax(double tax) {
			this.tax = tax;
		}
		public String getModeOfPayment() {
			return modeOfPayment;
		}
		public void setModeOfPayment(String modeOfPayment) {
			this.modeOfPayment = modeOfPayment;
		}
		public double getTotalAmount() {
			return totalAmount;
		}
		public void setTotalAmount(double totalAmount) {
			this.totalAmount = totalAmount;
		}
		public Bill(int billId, int brandId, LocalDate billDate, String brandName, int size, String unit,
				int quantityInBottles, double mrp, double tax, String modeOfPayment, double totalAmount) {
			super();
			this.billId = billId;
			this.brandId = brandId;
			this.billDate = billDate;
			this.brandName = brandName;
			this.size = size;
			this.unit = unit;
			this.quantityInBottles = quantityInBottles;
			this.mrp = mrp;
			this.tax = tax;
			this.modeOfPayment = modeOfPayment;
			this.totalAmount = totalAmount;
		}
		public Bill() {
			super();
			// TODO Auto-generated constructor stub
		}
	    
	    
}
