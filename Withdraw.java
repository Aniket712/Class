package Banking;

class Withdraw implements Runnable{
    int amount;
    Account acc;
    public Withdraw(Account acc, int amount)
    {
        this.acc = acc;
        this.amount = amount;
        new Thread(this).start();
    }
    
    public void run() {
        acc.withdrawn(amount);
    }
}
