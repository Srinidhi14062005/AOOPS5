package com.banking;

public class BankingProcess {
	 private LoginStateManager loginStateManager;

	    public BankingProcess() {
	        loginStateManager = LoginStateManager.getInstance();
	    }

	    public void viewBalance() {
	        if (loginStateManager.isLoggedIn()) {
	            System.out.println("Displaying balance...");
	            	        } else {
	            System.out.println("User not logged in. Please login to view balance.");
	        }
	    }

	    public void deposit(double amount) {
	        if (loginStateManager.isLoggedIn()) {
	            System.out.println("Depositing amount: " + amount);
	        } else {
	            System.out.println("User not logged in. Please login to deposit money.");
	        }
	    }

	    public void withdraw(double amount) {
	        if (loginStateManager.isLoggedIn()) {
	            System.out.println("Withdrawing amount: " + amount);
	        } 
	        else {
	            System.out.println("User not logged in. Please login to withdraw money.");
	        }
	    }
	}

