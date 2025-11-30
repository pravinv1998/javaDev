import java.util.Scanner;

public class StarPatterns {

    // 1. Right-Angled Triangle
    static void rightTriangle(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // 2. Inverted Right-Angled Triangle
    static void invertedRightTriangle(int n) {
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // 3. Pyramid
    static void pyramid(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // 4. Diamond
    static void diamond(int n) {
        // upper pyramid
        for (int i = 1; i <= n; i++) {
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        // lower inverted pyramid
        for (int i = n - 1; i >= 1; i--) {
            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // 5. Hollow Square
    static void hollowSquare(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == 1 || i == n || j == 1 || j == n) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice, n;

        do {
            System.out.println("\n--- Star Pattern Menu ---");
            System.out.println("1. Right-Angled Triangle");
            System.out.println("2. Inverted Right-Angled Triangle");
            System.out.println("3. Pyramid");
            System.out.println("4. Diamond");
            System.out.println("5. Hollow Square");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            if (choice >= 1 && choice <= 5) {
                System.out.print("Enter number of rows: ");
                n = sc.nextInt();
            } else {
                n = 0;
            }

            switch (choice) {
                case 1:
                    rightTriangle(n);
                    break;
                case 2:
                    invertedRightTriangle(n);
                    break;
                case 3:
                    pyramid(n);
                    break;
                case 4:
                    diamond(n);
                    break;
                case 5:
                    hollowSquare(n);
                    break;
                case 6:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice != 6);

        sc.close();
    }
}
