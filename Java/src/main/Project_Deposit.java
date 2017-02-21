package main;

import java.util.ArrayList;
import java.util.Scanner;

import deposit_package.Deposit;
import factory_package.Cash_Fac;
import factory_package.Check_Fac;
import factory_package.Transfer_Fac;

public class Project_Deposit {
	private static ArrayList<String> deposit_list = new ArrayList<String>();
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		while(true) {
			System.out.println("Please choose an option:");
			System.out.println("1. Cash Deposit");
			System.out.println("2. Check Deposit");
			System.out.println("3. Transfer Deposit");
			System.out.println("4. Print Transactions");
			System.out.println("5. Exit");
			int type;
			if (s.hasNext())
				type = s.nextInt();
			else
				type = 0;
			if (type == 5) {
				s.close();
				break;
			}
			if (type != 1 && type != 2 && type != 3 && type != 4)
				System.out.println("Invaild input!");

			switch(type) {
				case 1: {
					System.out.println("Please input deposit amount: ");
					double amount;
					if (s.hasNext())
						amount = s.nextDouble();
					else
						amount = 0;
					Cash_Fac cashfac = new Cash_Fac();
					Deposit cashdeposit = cashfac.createDeposit(amount);
					deposit_list.add(cashdeposit.get_deposit());
					System.out.println();
					break;
				}
				case 2: {
					System.out.println("Please input deposit amount: ");
					double amount;
					if (s.hasNext())
						amount = s.nextDouble();
					else
						amount = 0;
					Check_Fac checkfac = new Check_Fac();
					Deposit checkdeposit = checkfac.createDeposit(amount);
					deposit_list.add(checkdeposit.get_deposit());
					System.out.println();
					break;
				}
				case 3: {
					System.out.println("Please input deposit amount: ");
					double amount;
					if (s.hasNext())
						amount = s.nextDouble();
					else
						amount = 0;
					Transfer_Fac transferfac = new Transfer_Fac();
					Deposit transferdeposit = transferfac.createDeposit(amount);
					deposit_list.add(transferdeposit.get_deposit());
					System.out.println();
					break;
				}
				case 4: {
					System.out.println("Transactions:");
					for (String i : deposit_list) {
						System.out.println("    " + i);
					}
					System.out.println();
				}
			}
			
		}
		s.close();
	}
}
