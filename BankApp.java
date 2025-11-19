
import java.util.Scanner;

public class BankApp {
    private int mainLedger;

    public static void main(String[] args) {
        BankApp bank = new BankApp();
        Scanner scanner = new Scanner(System.in);

        bank.homePage();
        String operationChoice;
        operationChoice = scanner.nextLine();

        // still errror not working

        do {
            switch (operationChoice) {
                case "w": {
                    System.out.println("withdraw");
                    break;
                }
                case "d": {
                    System.out.println("deposit");
                    break;
                }
                case "s": {
                    System.out.println("show balance");
                    break;
                }
                case "e": {
                    System.out.println("exit");
                    break;

                }

            }

        } while (operationChoice != "e");

        scanner.close();
    }

    void homePage() {
        System.out.println("=========================");
        System.out.println("|        DBCC Bank       |");
        System.out.println("=========================");
        System.out.println("W - Withdraw");
        System.out.println("D - Deposit");
        System.out.println("W - Withdraw");
        System.out.println("N - New Account");
        System.out.println("=========================");
        System.out.println("|Todays Ledger: " + "|");
    }

    void createAccount() {

    }

    int getLedger() {

        return this.mainLedger;
    }

    int bankledger(int ledgerVal) {
        this.mainLedger = ledgerVal;
        return mainLedger;
    }
}
