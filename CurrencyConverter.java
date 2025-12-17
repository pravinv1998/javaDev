import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Example exchange rates (static for demo).
        // In real-world apps, you’d fetch live rates via an API.
        Map<String, Double> rates = new HashMap<>();
        rates.put("USD", 1.0); // Base currency
        rates.put("INR", 83.0); // 1 USD = 83 INR
        rates.put("EUR", 0.92); // 1 USD = 0.92 EUR
        rates.put("GBP", 0.78); // 1 USD = 0.78 GBP
        rates.put("JPY", 146.0); // 1 USD = 146 JPY
        rates.put("AUD", 1.50); // 1 USD = 1.50 AUD

        System.out.println("Available currencies: " + rates.keySet());
        System.out.print("Enter source currency (e.g., USD, INR): ");
        String sourceCurrency = sc.next().toUpperCase();

        if (!rates.containsKey(sourceCurrency)) {
            System.out.println("Currency not supported!");
            return;
        }

        System.out.print("Enter amount in " + sourceCurrency + ": ");
        double amount = sc.nextDouble();

        // Convert to USD first (base currency)
        double amountInUSD = amount / rates.get(sourceCurrency);

        System.out.println("\nConverted amounts:");
        for (String targetCurrency : rates.keySet()) {
            double converted = amountInUSD * rates.get(targetCurrency);
            System.out.printf("%s : %.2f%n", targetCurrency, converted);
        }

        sc.close();
    }
}