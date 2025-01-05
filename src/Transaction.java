import java.util.Date;

public class Transaction {
    String type;
    double amount;
    Date date;
    int sourceWalletId;
    int targetWalletId;

    public Transaction(String type, double amount, int sourceWalletId, int targetWalletId) {
        this.type = type;
        this.amount = amount;
        this.date = new Date();
        this.sourceWalletId = sourceWalletId;
        this.targetWalletId = targetWalletId;
    }

    public String toString() {
        return "Transaction: " + type + ", Amount: " + amount + ", Date: " + date +
                ", Source Wallet: " + sourceWalletId + ", Target Wallet: " + targetWalletId;
    }
}
