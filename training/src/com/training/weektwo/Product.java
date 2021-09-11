package com.training.weektwo;

public class Product {
	private long id;
	private String productName;

	private String SuplierName;

	public void setId(long id) {
		this.id = id;
	}

	public long getId() {
		return this.id;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getSuplierName() {
		return SuplierName;
	}

	public void setSuplierName(String suplierName) {
		SuplierName = suplierName;
	}

}
