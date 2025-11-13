import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // main class object
        Main dataMain = new Main();

        // print star pattern
        dataMain.strPattern();
        // dataMain.revStrPattern() ;

        // get input from user through cmd
        // dataMain.getInput();

        dataMain.dataTypes();

    }

    void dataTypes() {
        // numeric types
        byte b = 1;
        short sh = 12;
        int integer = 1234;
        long ln = 1233456789;

        // float types
        float ft = 1.5f;
        double dbl = 2.5;

        // character type
        char ch = 'p'; // in single coats, douluo cots use for strings...

        // boolear type
        boolean isTrue = true; // ans may be True/False..

        System.out.println(b);
        System.out.println(sh);
        System.out.println(integer);
        System.out.println(ln);
        System.out.println(ft);
        System.out.println(dbl);
        System.out.println(ch);
        System.out.println(isTrue);

    }

    void getInput() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter name:- ");
        String name = scanner.nextLine();
        System.out.println("Hi! " + name);

        scanner.close();
    }

    void strPattern() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }

    // void revStrPattern() {
    // for (int i = 5; i >= 1; i--) {
    // for (int j = 1; j < (5 - i); j++) {
    // System.out.print(" ");
    // }
    // for (int k = 1; k <= (5 - i); k++) {
    // System.out.print("*");
    // }
    // System.out.println();
    // }
    // }

    static void data(String name) {
        System.out.println(name);
    }

    void cal(int num) {
        System.out.println(num);
    }
}