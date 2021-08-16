package com.main.model;

public class Products {

	private String pName;
	private long pQuantity;
	private long pPrice;

	public Products(String pName, long pQuantity, long pPrice) {
		super();
		this.pName = pName;
		this.pQuantity = pQuantity;
		this.pPrice = pPrice;
	}

	public Products() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public long getpQuantity() {
		return pQuantity;
	}

	public void setpQuantity(long pQuantity) {
		this.pQuantity = pQuantity;
	}

	public long getpPrice() {
		return pPrice;
	}

	public void setpPrice(long pPrice) {
		this.pPrice = pPrice;
	}

	@Override
	public String toString() {
		return "Products [pName=" + pName + ", pQuantity=" + pQuantity + ", pPrice=" + pPrice + "]";
	}
	
	

}
