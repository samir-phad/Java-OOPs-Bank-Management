package com.braindata.bankmanagement.serviceImpl;

import java.util.Scanner;

import com.braindata.bankmanagement.model.Account;
import com.braindata.bankmanagement.service.Rbi;

public class Sbi implements Rbi {

	Account acc[] = new Account[2];
	Scanner scanner = new Scanner(System.in);
	final int MINIMUM_BALANCE = 2000;

	@Override
	public void createAccount() {

		for (int i = 0; i < acc.length; i++) {
			Account account = new Account();
			System.out.println("CreateAccount");
			System.out.print("Enter Your Account No :- ");
			int accNo = scanner.nextInt();
			account.setAccNo(accNo);
			System.out.println();

			System.out.print("Enter Your Name :- ");
			scanner.nextLine();
			String name = scanner.nextLine();
			account.setName(name);
			System.out.println();

			System.out.print("Enter Your Mobile No:- ");
			String mobno = scanner.next();
			account.setMobNo(mobno);
			System.out.println();

			System.out.print("Enter Your Adhar No:- ");
			String adharNo = scanner.next();
			account.setAdharNo(adharNo);
			System.out.println();

			System.out.print("Enter Your gender M/F :- ");
			String gender = scanner.next();
			account.setGender(gender);
			System.out.println();

			System.out.print("Enter Your age :- ");
			int age = scanner.nextInt();
			account.setAge(age);
			System.out.println();

			boolean run = true;
			do {
				System.out.print("Enter Your balance :- ");
				double balance = scanner.nextDouble();
				if (balance >= MINIMUM_BALANCE) {
					account.setBalance(balance);
					run = false;
				} else {
					System.out.println("Minimun Balance " + MINIMUM_BALANCE + " required");
				}

			} while (run);

			acc[i] = account;

			System.out.println("Account Created Successfully!");
		}

	}

	@Override
	public void displayAllDetails() {
		
		System.out.println("Enter Your Account No :- ");
		int accNo = scanner.nextInt();


		for (Account account : acc) {
			
			if (account.getAccNo() == accNo) {

			System.out.println("Account No :- " + account.getAccNo());

			System.out.println("Account Holder Name :- " + account.getName());

			System.out.println("Account Holder Mobile No:- " + account.getMobNo());

			System.out.println("Account Holder Adhar No:- " + account.getAdharNo());

			System.out.println("Account Holder gender :- " + account.getGender());

			System.out.println("Account Holder age :- " + account.getAge());

			System.out.println("Account balance No :- " + account.getBalance());

			System.out.println("-------------------------------------");
			}

		}

	}

	@Override
	public void depositMoney() {

		System.out.println("Enter Your Account No :- ");
		int accNo = scanner.nextInt();

		for (Account account : acc) {

			if (account.getAccNo() == accNo) {

				System.out.println("Enter Your Deposite Amount :- ");
				double depositAmount = scanner.nextDouble();

				account.setBalance(depositAmount + account.getBalance());

				System.out.println("Money deposite Successfully");
				System.out.println("Current Balance is :- " + account.getBalance());
			}
		}
	}

	@Override
	public void withDrawal() {

		System.out.println("Enter Your Account No :- ");
		int accNo = scanner.nextInt();

		for (Account account : acc) {
			if (account.getAccNo() == accNo) {
				System.out.println("Enter Your withDrawal Amount :- ");
				double withAmount = scanner.nextDouble();
				if (account.getBalance() >= withAmount) {
					account.setBalance(account.getBalance() - withAmount);
					System.out.println("Money withDrawal Successfully");
					System.out.println("Current Balance is :- " + account.getBalance());

				} else {
					System.out.println(withAmount + " it is more than your Current Balance");
				}
			}
		}

	}

	@Override
	public void balanceCheck() {
		System.out.println("Enter Your Account No :- ");
		int accNo = scanner.nextInt();

		for (Account account : acc) {

			if (account.getAccNo() == accNo) {
				System.out.println("Current Balance is : " + account.getBalance());
			}
		}
	}

}
