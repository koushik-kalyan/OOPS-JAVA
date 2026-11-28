import transaction.*;
import reports.*;
public class MainApp {
    public static void main(String[] args) {
        TransactionReport acc = new TransactionReport(1001, 5000);
        acc.deposit(2000);
        acc.withdraw(1500);
        acc.withdraw(10000);
        acc.generateReport();

        System.out.println("\nKoushik kalyan N\n1WN25CS112");
    }
}
