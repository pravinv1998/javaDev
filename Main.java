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