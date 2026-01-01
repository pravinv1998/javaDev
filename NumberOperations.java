import java.util.Scanner;

public class NumberOperations {

    // Method to check if a number is prime
    public static boolean isPrime(int num) {
        if (num <= 1)
            return false;
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0)
                return false;
        }
        return true;
    }

    // Method to reverse a number
    public static int reverseNumber(int num) {
        int reversed = 0;
        while (num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }
        return reversed;
    }

    // Method to print Fibonacci series up to n terms
    public static void fibonacciSeries(int n) {
        int first = 0, second = 1;
        System.out.print("Fibonacci Series: ");
        for (int i = 1; i <= n; i++) {
            System.out.print(first + " ");
            int next = first + second;
            first = second;
            second = next;
        }
        System.out.println();
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prime check
        System.out.print("Enter a number to check prime: ");
        int primeInput = sc.nextInt();
        System.out.println(primeInput + (isPrime(primeInput) ? " is Prime" : " is Not Prime"));

        // Reverse number
        System.out.print("Enter a number to reverse: ");
        int reverseInput = sc.nextInt();
        System.out.println("Reversed Number: " + reverseNumber(reverseInput));

        // Fibonacci series
        System.out.print("Enter number of terms for Fibonacci series: ");
        int fibInput = sc.nextInt();
        fibonacciSeries(fibInput);

        sc.close();
    }
}
