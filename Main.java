public class Main {
    public static void main(String[] args) {
        // System.out.println("this is java code...");
        // System.out.print("1");
        // System.out.print(" Pravin");
        // System.out.println(" 5295");

        // Main.data("pravin");
        //
        // Main dataMain = new Main();
        // dataMain.cal(5);

        // print star pattern

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }

    static void data(String name) {
        System.out.println(name);
    }

    void cal(int num) {
        System.out.println(num);
    }
}