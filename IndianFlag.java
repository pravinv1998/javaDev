public class IndianFlag {
    public static void main(String[] args) {
        // ANSI escape codes for colors
        final String RESET = "\u001B[0m";
        final String ORANGE = "\u001B[38;5;208m"; // Saffron
        final String WHITE = "\u001B[37m"; // White
        final String GREEN = "\u001B[32m"; // Green
        final String BLUE = "\u001B[34m"; // Navy Blue (Ashoka Chakra)

        // Print the flag
        for (int i = 0; i < 3; i++) {
            System.out.println(ORANGE + "████████████████████████████" + RESET);
        }

        // White section with Chakra in the middle
        for (int i = 0; i < 3; i++) {
            if (i == 1) {
                System.out.println(WHITE + "████████" + BLUE + "⚙⚙⚙⚙⚙⚙" + WHITE + "████████" + RESET);
            } else {
                System.out.println(WHITE + "████████████████████████████" + RESET);
            }
        }

        // Green section
        for (int i = 0; i < 3; i++) {
            System.out.println(GREEN + "████████████████████████████" + RESET);
        }
    }
}