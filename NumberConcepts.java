public class NumberConcepts {

    // Method to check if a number is prime
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false; // 0 and 1 are not prime
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false; // divisible by i → not prime
            }
        }
        return true;
    }

    // Method to check if a number is even
    public static boolean isEven(int num) {
        return num % 2 == 0;
    }

    // Method to check if a number is odd
    public static boolean isOdd(int num) {
        return num % 2 != 0;
    }

    // Main method to test the above methods
    public static void main(String[] args) {
        int number = 17;

        // Prime check
        if (isPrime(number)) {
            System.out.println(number + " is a Prime number.");
        } else {
            System.out.println(number + " is NOT a Prime number.");
        }

        // Even check
        if (isEven(number)) {
            System.out.println(number + " is Even.");
        } else {
            System.out.println(number + " is NOT Even.");
        }

        // Odd check
        if (isOdd(number)) {
            System.out.println(number + " is Odd.");
        } else {
            System.out.println(number + " is NOT Odd.");
        }
    }
}
