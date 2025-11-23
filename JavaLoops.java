import java.net.Socket;

public class JavaLoops {
    public static void main(String[] args) {
        for (int i = 0; i <= 5; i++) { // for loop
            System.out.println(i + " " + "value of i");
        }

        int dataCount = 0;
        while (dataCount <= 5) {
            System.out.println(dataCount);
            dataCount++;
        }

        int i = 1;
        do {
            System.out.println(i);
            i++;
        } while (i <= 5);

        String[] cars = { "Volvo", "BMW", "Ford", "Mazda" };

        for (String car : cars) {
            System.out.println(car);
        }
    }
}
