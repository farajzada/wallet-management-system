import java.util.ArrayList;
import java.util.List;

public class WalletManagementApp {
    static List<Transaction> transactionLog = new ArrayList<>();

    public static void transfer(Wallet fromWallet, Wallet toWallet, double amount) {
        if (fromWallet.withdraw(amount)) {
            toWallet.deposit(amount);
            transactionLog.add(new Transaction("Transfer", amount, fromWallet.getId(), toWallet.getId()));
            System.out.println("Transfer successful!");
        }
    }

    public static void main(String[] args) {
        User user1 = new User(1, "Murad", "murad@example.com");
        User user2 = new User(2, "Murad2", "murad2@example.com");

        Wallet wallet1 = new Wallet(1, user1.getId(), 1000);
        Wallet wallet2 = new Wallet(2, user2.getId(), 500);

        wallet1.deposit(1000);
        wallet1.withdraw(500);
        transfer(wallet1, wallet2, 600);


        System.out.println("\nTransaction Log:");
        for (Transaction t : transactionLog) {
            System.out.println(t);
        }
    }
}
