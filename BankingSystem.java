package Banking;

import java.util.Scanner;

public class BankingSystem {

	public static void main(String[] args) {
		Account acc = new Account();
		acc.balance = 1000;
		acc.accountNo = 111;
		Deposit dp;
		Withdraw wd;
		AccountStatement as = new AccountStatement();
		while(true) {
			System.out.println("1.Check Balance 2.Deposit 3.Withdraw 4.Account Statement 5.Exit");
			System.out.println("Enter your choice");
			Scanner sc = new Scanner(System.in);
			int choice = sc.nextInt();
			switch(choice) {
			case 1: 
				acc.displayBalance();
				break;
			case 2: 
				System.out.println("Enter the amount you want to deposit");
				int deposit_amount = sc.nextInt();
				dp = new Deposit(acc, deposit_amount);
				break;
			case 3: 
				System.out.println("Enter the amount you want to withdraw");
				int withdrawal_amount = sc.nextInt();
				wd = new Withdraw(acc, withdrawal_amount);
				break;
			case 4: 
				as.enquiry();
				break;
			case 5:
				break;
			default:
				System.out.println("Please enter a valid choice");
				break;
			}
			if(choice == 5) {
				System.out.println("Thank You");
				break;
			}
		}

	}

}
