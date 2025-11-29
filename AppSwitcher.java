import java.util.Scanner;

public class AppSwitcher {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Show menu
        System.out.println("Choose an option:");
        System.out.println("1. Calculator");
        System.out.println("2. Bank App");
        System.out.println("3. Invoice App");

        int choice = scanner.nextInt();

        // Switch statement to call methods
        switch (choice) {
            case 1:
                showCalculator();
                break;
            case 2:
                showBankApp();
                break;
            case 3:
                showInvoiceApp();
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
        }

        scanner.close();
    }

    // Method for Calculator
    public static void showCalculator() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Simple Calculator:");
        System.out.print("Enter first number: ");
        int a = scanner.nextInt();
        System.out.print("Enter second number: ");
        int b = scanner.nextInt();
        System.out.println("Sum = " + (a + b));
        // You can add more operations later
    }

    // Method for Bank App
    public static void showBankApp() {
        System.out.println("Welcome to the Bank App!");
        System.out.println("Balance: ₹10,000");
        System.out.println("Feature: Deposit, Withdraw (not implemented yet)");
    }

    // Method for Invoice App
    public static void showInvoiceApp() {
        System.out.println("Invoice App:");
        System.out.println("Item: Laptop");
        System.out.println("Price: ₹50,000");
        System.out.println("Tax: ₹5,000");
        System.out.println("Total: ₹55,000");
    }
}