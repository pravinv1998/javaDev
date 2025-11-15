
import java.util.Scanner;

public class BankApp {
    private int mainLedger;

    public static void main(String[] args) {
        BankApp bank = new BankApp();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Set Bank Opening Ledger: ");
        int ledger = scanner.nextInt();
        bank.bankledger(ledger);

        System.out.println("=========================");
        System.out.println("|        DBCC Bank       |");
        System.out.println("=========================");
        System.out.println("D - Deposit");
        System.out.println("W - Withdraw");
        System.out.println("=========================");
        System.out.println("|Todays Ledger: " + bank.getLedger());

        // int getledger = bank.bankledger();

        scanner.close();
    }

    void withdraw() {

    }

    int getLedger() {
        // System.out.print("Ledger: ");
        // System.out.println(this.mainLedger);
        return this.mainLedger;
    }

    int bankledger(int ledgerVal) {
        this.mainLedger = ledgerVal;
        return mainLedger;
    }
}
