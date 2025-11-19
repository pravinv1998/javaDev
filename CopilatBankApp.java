
// Beginner-friendly Bank Operations
import java.util.Scanner;

class BankAccount {
    int accountNumber;
    String ownerName;
    double balance;

    // Method to set account details (instead of constructor)
    void setDetails(int accNo, String name, double initialBalance) {
        accountNumber = accNo;
        ownerName = name;
        balance = initialBalance;
    }

    void deposit(double amount) {
        balance = balance + amount;
        System.out.println("Deposited: " + amount);
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance = balance - amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Not enough balance!");
        }
    }

    void showBalance() {
        System.out.println("Account: " + accountNumber);
        System.out.println("Owner: " + ownerName);
        System.out.println("Balance: " + balance);
    }
}

public class CopilatBankApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Create object
        BankAccount account = new BankAccount();
        account.setDetails(101, "Pravin", 1000);

        int choice;
        do {
            System.out.println("\n--- Bank Menu ---");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Show Balance");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            if (choice == 1) {
                System.out.print("Enter amount to deposit: ");
                double dep = sc.nextDouble();
                account.deposit(dep);
            } else if (choice == 2) {
                System.out.print("Enter amount to withdraw: ");
                double wd = sc.nextDouble();
                account.withdraw(wd);
            } else if (choice == 3) {
                account.showBalance();
            } else if (choice == 4) {
                System.out.println("Goodbye!");
            } else {
                System.out.println("Invalid choice!");
            }
        } while (choice != 4);

        sc.close();
    }
}