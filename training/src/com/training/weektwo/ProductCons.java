package com.training.weektwo;

public class ProductCons {
	private long id;
	private String productName;

	private String SuplierName;

	ProductCons() {
		System.out.println(" this is a default cons");
	}

	ProductCons(long id, String productName, String suplierName) {
		this();
		System.out.println("paramnertized Construotr styarted");
		this.id = id;
		this.productName = productName;
		this.SuplierName = suplierName;

	}

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
		this.SuplierName = suplierName;
	}

	void display() {
		System.out.println("product is " + getId());
		System.out.println("product name  is " + getProductName());
		System.out.println("Manufacturere name  is " + getSuplierName());
	}

}
