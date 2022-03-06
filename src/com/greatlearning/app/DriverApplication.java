package com.greatlearning.app;

import java.util.Scanner;

import com.greatlearning.model.Bank;
import com.greatlearning.service.BankingService;

public class DriverApplication {

	static Bank bank = new Bank("Indian Bank", "IB2001", "India");
	
	public static void main(String[] args) {
		System.out.println("Welcome to Banking System");
	
//		Bank bank = new Bank("Indian Bank", "IB2001", "India");
		
		// Creating an console interface
		int option = 0;
		Scanner scanner = new Scanner(System.in);
		BankingService bankingService = new BankingService(bank);
		
		do {
			System.out.println("Enter Option 1 to Deposit");
			System.out.println("Enter Option 2 to Withdraw");
			System.out.println("Enter Option 3 to Check Balance");
			System.out.println("Enter Option 4 to Transfer");
			System.out.println("Enter Option 0 to Exit");
			option = scanner.nextInt();
			switch(option) {
			case 1:
				// deposit
				System.out.println("Enter Account Details");
				String account = scanner.next();
				System.out.println("Enter amount to deposit");
				double amount = scanner.nextDouble();
				bankingService.depositToAccount(account, amount);
				break;
			case 2:
				// withdraw
				System.out.println("Enter Account Details");
				String accountNum = scanner.next();
				System.out.println("Enter amount to withdraw");
				double amnt = scanner.nextDouble();
				bankingService.withdrawFromAccount(accountNum, amnt);
				break;
			case 3:
				System.out.println("Enter Account Details");
				String accountNumber = scanner.next();
				double balance = bankingService.getCustomerBalance(accountNumber);
				System.out.println(balance);
				break;
			case 4:
				System.out.println("Enter Account number to withdraw");
				String accountTo = scanner.next();
				System.out.println("Enter Account number to deposit");
				String accountToDeposit = scanner.next();
				System.out.println("Enter amount to transfer");
				double amountToTransfer = scanner.nextDouble();
				bankingService.transfer(accountTo, accountToDeposit, amountToTransfer);
				break;
			default:
				System.out.println("Please Enter the Right Option");
			}
		} while(option != 0);
		scanner.close();
	}
	
}
