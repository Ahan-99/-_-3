package com.main;

import java.util.Scanner;

public class AtmInterface {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BankAccount a = new BankAccount();

		boolean isValid = a.login();
		if(isValid) {
			boolean flag = false;
		    while(!flag) {
		    	System.out.println("Enter your choice");
				System.out.println("1.Transactions History\n2.Withdraw\n3.Deposit\n4.Transfer\n5.Check Balance\n6.Exit\n");
				int choice = sc.nextInt();
				
				switch(choice){
					case 1:
						a.transactionHistory();
						break;
					case 2:
						a.withdraw();
						break;
					case 3:
						a.deposit();
						break;
					case 4:
						a.transfer();
						break;
					case 5:
						a.checkBalance();
						break;
					case 6:
						flag = true;
						System.out.println("\nThankyou for visiting!!!");
						break;
					default:
						System.out.println("Enter correct choice...");				
				}
			}
		}
		
	}
}