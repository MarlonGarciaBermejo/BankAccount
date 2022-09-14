public class Acc {
    private double balance;

    private String name;

    private static int count = 0;

    public Acc() {
        this.balance = 0.0;
        this.count++;

    }

    public Acc(double startBalance) {
        this.balance = startBalance;
        this.count++;
    }

    public double getBalance() {
        return this.balance;
    }
    public void deposit(double amount) {
        balance += amount;
        this.count++;
        //balance = balance + amount;

    }

    public double withdraw(double amount) {
        if (this.balance >= amount && amount > 0) {
            this.balance -= amount;
            return amount;


        }
        return 0;
    }
}
