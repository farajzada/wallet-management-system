public class Wallet  {
    private int id;
    private double balance;
    private int userID;

    public Wallet(int id, double balance, int userID) {
        this.id = id;
        this.balance = balance;
        this.userID = userID;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited " + amount + " to Wallet " + id);
    }

    public boolean withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrew " + amount + " from Wallet " + id);
            return true;
        } else {
            System.out.println("Insufficient balance in Wallet " + id);
            return false;
        }
    }

    public int getId() {
        return id;
    }

    public double getBalance() {
        return balance;
    }

    public int getUserID() {
        return userID;
    }
}
