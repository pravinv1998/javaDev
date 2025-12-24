import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PlanetDistance {
    public static void main(String[] args) {
        // Distances from Sun in million kilometers (approximate values)
        Map<String, Double> planetDistances = new HashMap<>();
        planetDistances.put("Mercury", 57.9);
        planetDistances.put("Venus", 108.2);
        planetDistances.put("Earth", 149.6);
        planetDistances.put("Mars", 227.9);
        planetDistances.put("Jupiter", 778.5);
        planetDistances.put("Saturn", 1434.0);
        planetDistances.put("Uranus", 2871.0);
        planetDistances.put("Neptune", 4495.0);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the planet name (e.g., Earth, Mars, Jupiter): ");
        String planet = scanner.nextLine().trim();

        if (planetDistances.containsKey(planet)) {
            double distance = planetDistances.get(planet);
            System.out.println("The average distance of " + planet + " from the Sun is "
                    + distance + " million km.");
        } else {
            System.out.println("Planet not found. Please enter a valid planet name.");
        }

        scanner.close();
    }
}