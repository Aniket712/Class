package Banking;

class Deposit implements Runnable{
	int amount;
	Account acc;
	public Deposit(Account acc, int amount) {
		this.acc = acc;
		this.amount = amount;
		new Thread(this).start();
	}
	public void run() {
		acc.deposit(amount);
	}
}