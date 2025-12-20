import java.util.Scanner;

public class WorldWeightCalculator {

    // Approximate gravitational acceleration values (m/s^2)
    static double gEquator = 9.780; // Equator
    static double gPole = 9.832; // Poles
    static double gAverage = 9.806; // Average Earth

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your mass in kilograms: ");
        double mass = sc.nextDouble();

        // Calculate weight = mass * g
        double weightEquator = mass * gEquator;
        double weightPole = mass * gPole;
        double weightAverage = mass * gAverage;

        System.out.println("\nYour weight at different locations:");
        System.out.println("At Equator: " + weightEquator + " N");
        System.out.println("At Poles: " + weightPole + " N");
        System.out.println("Average Earth: " + weightAverage + " N");

        sc.close();
    }
}