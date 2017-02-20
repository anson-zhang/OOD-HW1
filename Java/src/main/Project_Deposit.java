package main;

import java.util.Scanner;

import deposit_package.Deposit;
import factory_package.Cash_Fac;
import factory_package.Check_Fac;
import factory_package.Transfer_Fac;

public class Project_Deposit {
	public static void main(String[] args) {
		System.out.println("Please choose an option:");
		System.out.println("1. Cash Deposit");
		System.out.println("2. Check Deposit");
		System.out.println("3. Transfer Deposit");
		Scanner s = new Scanner(System.in);
		int type = s.nextInt();
		if (type != 1 && type != 2 && type != 3)
			System.out.println("Invaild input!");
		System.out.println("Please input deposit amount: ");
		double amount = s.nextDouble();
		switch(type) {
			case 1: {
				Cash_Fac cashfac = new Cash_Fac();
				Deposit cashdeposit = cashfac.createDeposit(amount);
				cashdeposit.get_deposit();
				break;
			}
			case 2: {
				Check_Fac checkfac = new Check_Fac();
				Deposit checkdeposit = checkfac.createDeposit(amount);
				checkdeposit.get_deposit();
				break;
			}
			case 3: {
				Transfer_Fac transferfac = new Transfer_Fac();
				Deposit transferdeposit = transferfac.createDeposit(amount);
				transferdeposit.get_deposit();
				break;
			}
		}
		s.close();
	}
}
