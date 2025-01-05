public class Wallet  {
    private int id;
    private int balance;
    private int userID;

    public Wallet(int id, int balance, int userID) {
        this.id = id;
        this.balance = balance;
        this.userID = userID;
    }

    public int getId() {
        return id;
    }

    public int getBalance() {
        return balance;
    }

    public int getUserID() {
        return userID;
    }
}
