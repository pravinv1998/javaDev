import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class UtilityDemo {

    // Method to print current date and time
    public static void printDateTime() {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        System.out.println("Current Date & Time: " + now.format(formatter));
    }

    // Method to print Java version
    public static void printJavaVersion() {
        String version = System.getProperty("java.version");
        System.out.println("Java Version: " + version);
    }

    // Method to convert seconds into HH:MM:SS format
    public static void convertSeconds(int totalSeconds) {
        int hours = totalSeconds / 3600;
        int minutes = (totalSeconds % 3600) / 60;
        int seconds = totalSeconds % 60;

        System.out.printf("Converted Time: %02d:%02d:%02d%n", hours, minutes, seconds);
    }

    public static void main(String[] args) {
        // Print date and time
        printDateTime();

        // Print Java version
        printJavaVersion();

        // Example conversion: 5000 seconds
        convertSeconds(5000);
    }
}