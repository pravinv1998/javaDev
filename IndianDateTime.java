import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class IndianDateTime {
    public static void main(String[] args) {
        // Get current date-time in IST
        LocalDateTime now = LocalDateTime.now(ZoneId.of("Asia/Kolkata"));

        // Indian style format: Day-Month-Year Hour:Minute:Second
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

        // Print formatted date-time
        String formattedDateTime = now.format(formatter);
        System.out.println("Indian Date-Time: " + formattedDateTime);

        // Optional: More descriptive Indian style
        DateTimeFormatter fancyFormatter = DateTimeFormatter.ofPattern("EEEE, dd MMMM yyyy hh:mm a");
        System.out.println("Indian Style Fancy: " + now.format(fancyFormatter));
    }
}