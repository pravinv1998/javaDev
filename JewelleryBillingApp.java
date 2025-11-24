import java.util.Scanner;

class JewelleryItem {
    String name;
    double pricePerGram;
    double weightInGrams;

    JewelleryItem(String name, double pricePerGram, double weightInGrams) {
        this.name = name;
        this.pricePerGram = pricePerGram;
        this.weightInGrams = weightInGrams;
    }

    double getTotalPrice() {
        return pricePerGram * weightInGrams;
    }
}

public class JewelleryBillingApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Jewellery Billing Application ===");

        // Input item details
        System.out.print("Enter item name: ");
        String name = sc.nextLine();

        System.out.print("Enter price per gram: ");
        double pricePerGram = sc.nextDouble();

        System.out.print("Enter weight in grams: ");
        double weight = sc.nextDouble();

        // Create item
        JewelleryItem item = new JewelleryItem(name, pricePerGram, weight);

        // Calculate billing
        double subtotal = item.getTotalPrice();
        double gstRate = 0.03; // 3% GST for example
        double gstAmount = subtotal * gstRate;
        double totalBill = subtotal + gstAmount;

        // Print bill
        System.out.println("\n--- BILL ---");
        System.out.println("Item: " + item.name);
        System.out.println("Weight: " + item.weightInGrams + " grams");
        System.out.println("Price per gram: ₹" + item.pricePerGram);
        System.out.println("Subtotal: ₹" + subtotal);
        System.out.println("GST (3%): ₹" + gstAmount);
        System.out.println("Total Bill: ₹" + totalBill);

        sc.close();
    }
}