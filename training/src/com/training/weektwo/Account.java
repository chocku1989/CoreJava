package com.training.weektwo;

public class Account {
	private String accNo;
	private int balance;
	public String getAccNo() {
		return accNo;
	}

	Account() {
		System.out.println(" this is a default cons");
	}
	
	Account(String accNo, int balance) {
	 this.accNo=accNo;
	 this.balance=balance;
	}

	public void setAccNo(String accNo) {
		this.accNo = accNo;
	}



	public int getBalance() {
		return balance;
	}



//	public void setBalance(int balance) {
//		this.balance = balance;
//	}

	public void deposit(int amount) {
		this.balance +=amount;
		System.out.println(amount +"rupess  added and Balamce is "+ this.balance);
	}
	public void withdraw(int amount) {
		if(this.balance>=amount) {
			this.balance -=amount;
			System.out.println(amount +"rupess  wihdrawn and Balamce is "+ this.balance);
		} else {
			System.out.println("Insuffcinet balance");
		}
		
	}

	public void displayBalance() {
		System.out.println( "Balamce is "+ this.balance);
	}

	
	

	

	

	void display() {
		System.out.println("Account no  is " + getAccNo());
		System.out.println("Balance is " + getBalance());
	}

}
