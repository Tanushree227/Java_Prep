public class Encapsulation {
    private double balance;
    public Encapsulation(double balance) {
        this.balance = balance;
    }
    
    public double getBalance()
    {
        return balance;
    }

    public void deposit(double amount)
    {
        if(amount > 0)
        {
            balance += amount;
        }
    }
}
