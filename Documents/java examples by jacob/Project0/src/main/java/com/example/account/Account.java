package com.example.account;

public class Account {
	
	private int client_id;
	private int account_id;
	private double amount;
	
	
//	public Account() {
//		
//	}	// TODO Auto-generated constructor stub
	


	public Account(int client_id, int account_id, double amount) {
		super();
		this.client_id = client_id;
		this.account_id = account_id;
		this.amount = amount;
	
		
	}



	public int getClient_id() {
		return client_id;
	}

	public void setClient_id(int client_id) {
		this.client_id = client_id;
	}

	public int getAccount_id() {
		return account_id;
	}

	public void setAccount_id(int account_id) {
		this.account_id = account_id;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}


	
	
	



	@Override
	public String toString() {
		return "Account [client_id=" + client_id + ", account_id=" + account_id + ", amount=" + amount + "]";
	}
	
	













	
	
}
