
import java.util.Scanner;

public class BankApp {
    private int mainLedger;

    public static void main(String[] args) {
        BankApp bank = new BankApp();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Set Bank Opening Ledger: ");
        int ledger = scanner.nextInt();
        int getBankLedger = bank.bankledger(ledger);

        bank.homePage(getBankLedger);

        // int getledger = bank.bankledger();

        scanner.close();
    }

    void homePage(int bankLedger) {
        System.out.println("=========================");
        System.out.println("|        DBCC Bank       |");
        System.out.println("=========================");
        System.out.println("W - Withdraw");
        System.out.println("D - Deposit");
        System.out.println("W - Withdraw");
        System.out.println("N - New Account");
        System.out.println("=========================");
        System.out.println("|Todays Ledger: " + bankLedger + "|");
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
