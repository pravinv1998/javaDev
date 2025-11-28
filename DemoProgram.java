public class DemoProgram {

    // Method to demonstrate loops
    public void loopExamples() {
        System.out.println("=== For Loop ===");
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                System.out.println("Skipping 3 using continue");
                continue; // skips this iteration
            }
            if (i == 5) {
                System.out.println("Breaking at 5");
                break; // exits the loop
            }
            System.out.println("i = " + i);
        }

        System.out.println("\n=== While Loop ===");
        int j = 1;
        while (j <= 3) {
            System.out.println("j = " + j);
            j++;
        }

        System.out.println("\n=== Do-While Loop ===");
        int k = 1;
        do {
            System.out.println("k = " + k);
            k++;
        } while (k <= 3);

        System.out.println("\n=== Enhanced For Loop ===");
        int[] numbers = { 10, 20, 30, 40 };
        for (int num : numbers) {
            System.out.println("Number: " + num);
        }
    }

    // Method to demonstrate switch
    public void switchExample(int day) {
        System.out.println("\n=== Switch Example ===");
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
            case 7:
                System.out.println("Weekend!");
                break;
            default:
                System.out.println("Invalid day");
        }
    }

    // Method with parameters and return value
    public int addNumbers(int a, int b) {
        return a + b;
    }

    // Main method
    public static void main(String[] args) {
        DemoProgram demo = new DemoProgram();

        // Call loop examples
        demo.loopExamples();

        // Call switch example
        demo.switchExample(3); // Wednesday

        // Call method with return value
        int sum = demo.addNumbers(15, 25);
        System.out.println("\nSum of 15 and 25 = " + sum);
    }
}