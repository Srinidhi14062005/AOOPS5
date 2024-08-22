package com.banking;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LoginStateManager loginStateManager = LoginStateManager.getInstance();

        BankingProcess bankingProcess = new BankingProcess();
        bankingProcess.viewBalance(); 
        loginStateManager.login();

        bankingProcess.viewBalance(); 
        bankingProcess.deposit(1000); 
        bankingProcess.withdraw(500); 

        // Logging out the user
        loginStateManager.logout();

        // Trying to access banking operations after logging out
        bankingProcess.viewBalance();
	}

}
