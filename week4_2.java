package reports;

import transaction.Account;

public class TransactionReport extends Account {

    public TransactionReport(int accountNumber, double balance) {
        super(accountNumber, balance);
    }

    public void generateReport() {
        System.out.println("\n=-- Transaction Report --");
        System.out.println("Account Number  : " + accountNumber);
        System.out.println("Current Balance : Rs. " + balance);
    }
}
