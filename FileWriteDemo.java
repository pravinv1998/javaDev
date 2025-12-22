import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWriteDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Accept file name from user
            System.out.print("Enter the file name (with extension, e.g., data.txt): ");
            String fileName = scanner.nextLine();

            // Accept file data from user
            System.out.println("Enter the data to write into the file:");
            String fileData = scanner.nextLine();

            // Write data into the file
            FileWriter writer = new FileWriter(fileName);
            writer.write(fileData);
            writer.close();

            System.out.println("Data successfully written to " + fileName);
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        } finally {
            scanner.close();
        }
    }
}