package Banking;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class Account {
	public int balance;
	public int accountNo;

	void displayBalance() {
		System.out.println("Account no " + this.accountNo + " Balance " + this.balance);
	}

	synchronized void deposit(int amount) {
		balance = this.balance + amount;
		try(FileWriter fstatement = new FileWriter("account_statement.txt",true);
				BufferedWriter statement = new BufferedWriter(fstatement))
		{
			String depoStr = amount + " is deposited\tAccount no " + this.accountNo + " Balance " + this.balance+"\n";
			statement.append(depoStr);
			
		}catch (Exception e)
		{
		e.printStackTrace();
		}
		System.out.println(amount + " is deposited");
		displayBalance();
	}

	synchronized void withdrawn(int amount) {
		balance = this.balance - amount;
		try(FileWriter fstatement = new FileWriter("account_statement.txt", true);
				BufferedWriter statement = new BufferedWriter(fstatement))
		{
			String withdrawStr = amount + " is withdrawn\tAccount no " + this.accountNo + " Balance " + this.balance+"\n";
			statement.write(withdrawStr);
			
		}catch (Exception e)
		{
		e.printStackTrace();
		}
		System.out.println(amount + " is withdrawn");
		displayBalance();
	}
}
