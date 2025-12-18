import java.util.Scanner;

public class EqualityCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Part 1: Check if four integers are equal
        System.out.println("Enter four integers:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        if (a == b && b == c && c == d) {
            System.out.println("equal");
        } else {
            System.out.println("not equal");
        }

        // Part 2: Check if two numbers are strictly between 0 and 1
        System.out.println("Enter two numbers (can be decimals):");
        double x = sc.nextDouble();
        double y = sc.nextDouble();

        if (x > 0 && x < 1 && y > 0 && y < 1) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

        sc.close();
    }
}
