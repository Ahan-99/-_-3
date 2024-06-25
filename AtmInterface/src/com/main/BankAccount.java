package com.main;
import java.util.*;

class BankAccount{
	String accountNo = "ANDB26541";
	int pin = 9654;
	float accountBalance = 10000.0f;
	int transactions = 0;
	String transactionHistory = "";
	
	Scanner sc = new Scanner(System.in);
	
	public boolean login() {
		boolean isLogin = false;
		System.out.println("Enter Account Number OR User Id");
		String UserAccNo = sc.nextLine();
		
		if(accountNo.equals(UserAccNo)) {
			System.out.println("Enter PIN");
			int userPin = sc.nextInt();
			if(pin == userPin) {
				isLogin = true;
			}
			else {
			    System.out.println("Incorrect PIN");
			    isLogin = false;
	    	}
		}
		else {
			System.out.println("Incorrect Account Number...");
			 isLogin = false;
		}
		return isLogin;
	}
	
	public void transactionHistory(){
		if(transactions == 0) {
			System.out.println("No transactions.\n");
		}
		else {
			System.out.println(transactionHistory);
		}
		
	}
	
	public void withdraw() {
		System.out.println("Enter amount to withdraw:");
		float amount = sc.nextFloat();
		
		if(accountBalance >= amount) {
			if(amount <= 10000) {
				accountBalance -= amount;
				transactions++;
				String str = amount + " Rs. Withdrawed.\n";
				transactionHistory = transactionHistory.concat(str);	
				System.out.println("Withdraw Successful.\n");
			}
			else {
				System.out.println("Limit is 10000.00.\n");
			}
		}
		else {
			System.out.println("Insufficient Balance.\n");
		}	
	}
	
	public void deposit() {
		System.out.println("Enter amount to deposit:");
		float amount = sc.nextFloat();
		
		if(amount <= 10000f) {
			accountBalance += amount;
			transactions++;
			String str = amount + " Rs. Deposited.\n";
			transactionHistory = transactionHistory.concat(str);
			System.out.println("Successfully Deposited.\n");
		}
		else {
			System.out.println("Limit is 10000.00.\n");
		}
	}
	
	public void transfer() {
		System.out.println("Enter Account Number of Receipent:");
		String AccNumberR = sc.next();
		
		System.out.println("Enter amount:");
		sc.nextLine();
		float amount = sc.nextFloat();
		
		if(accountBalance >= amount) {
			if(amount <= 15000f) {
				System.out.println("\nAmount transfered Successfully.\n");
				accountBalance -= amount;
				transactions++;
				String str = amount + " Rs. transfered to " + AccNumberR + "\n";
				transactionHistory = transactionHistory.concat(str);		
		    }
			else {
				System.out.println("Limit is 15000.00.\n");
			}
		}
		else {
			System.out.println("Insufficient Balance.\n");
		}
	}

	public void checkBalance() {
		System.out.println("Rs." + accountBalance + "\n");
	}

}