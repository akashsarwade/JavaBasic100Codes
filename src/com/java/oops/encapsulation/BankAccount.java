package com.java.oops.encapsulation;

public class BankAccount {

	private double balance;

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public void deposit(double amount) {
		if (amount > 0) {
			balance += amount;

		} else {
			System.out.println("Invalid Amount");
		}
	}

	public static void main(String[] args) {

		BankAccount b = new BankAccount();

		b.deposit(12.34d);
	}
}
