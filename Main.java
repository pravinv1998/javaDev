import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main dataMain = new Main();
        // System.out.println("this is java code...");
        // System.out.print("1");
        // System.out.print(" Pravin");
        // System.out.println(" 5295");

        // Main.data("pravin");
        //

        // dataMain.cal(5);

        // print star pattern

        // for (int i = 1; i <= 5; i++) {
        // for (int j = 1; j <= i; j++) {
        // System.out.print("* ");
        // }
        // System.out.println();
        // }

        // get input from user through cmd
        dataMain.getInput();

    }

    void getInput() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter name:- ");
        String name = scanner.nextLine();
        System.out.println("Hi! " + name);
    }

    // static void data(String name) {
    // System.out.println(name);
    // }

    // void cal(int num) {
    // System.out.println(num);
    // }
}