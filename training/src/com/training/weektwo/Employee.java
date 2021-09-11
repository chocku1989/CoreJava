package com.training.weektwo;

public class Employee {
	private static final String BATCH_CODE = "CHNFSD"; 
	private long id;
	private String empName;

	Employee() {
		System.out.println(" this is a default cons");
	}

	Employee(long id, String empName) {
		this();
		System.out.println("paramnertized Construotr styarted");
		this.id = id;
		this.empName = empName;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getId() {
		return this.id;
	}

	public String getEmpName() {
		return empName;
	}

	public void setProductName(String productName) {
		this.empName = productName;
	}


	void display() {
		System.out.println("Emp Id  is " + getId());
		System.out.println("Name is  is " + getEmpName());
	}

}
