package com.braindata.bankmanagement.client;

import java.util.Scanner;

import com.braindata.bankmanagement.service.Rbi;
import com.braindata.bankmanagement.serviceImpl.Sbi;

public class Test {

	public static void main(String[] args) {
		Rbi bank = new Sbi();
		Scanner sc = new Scanner(System.in);
		boolean run = true;

		do {
			System.out.println();
			System.out.println(
					"Enter 1 for Create Account.\nEnter 2 for disply all Details.\nEnter 3 for Deposite Money.\nEnter 4 for With Drawal Money.\nEnter 5 for Balance Check.\nEnter 0 for Close This Window.");
			int ch = sc.nextInt();
			if (ch == 0) {
				run = false;
				break;
			}

			switch (ch) {
			case 1:
				bank.createAccount();
				break;

			case 2:
				bank.displayAllDetails();
				break;

			case 3:
				bank.depositMoney();
				break;

			case 4:
				bank.withDrawal();
				break;

			case 5:
				bank.balanceCheck();
				break;
			default:
				System.out.println("Invalide Inpute");
			}

		} while (run);
		System.out.println("Window Closed");
	}

}
