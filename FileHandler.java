import java.io.*;
import java.nio.file.*;
import java.util.*;

public class FileHandler {

    // Method 1: Write using FileWriter
    public void writeWithFileWriter(String fileName, String content) {
        try (FileWriter writer = new FileWriter(fileName)) {
            writer.write(content);
            System.out.println("Written using FileWriter.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Method 2: Write using BufferedWriter
    public void writeWithBufferedWriter(String fileName, String content) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(fileName))) {
            bw.write(content);
            System.out.println("Written using BufferedWriter.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Method 3: Write using PrintWriter
    public void writeWithPrintWriter(String fileName, String content) {
        try (PrintWriter pw = new PrintWriter(fileName)) {
            pw.println(content);
            System.out.println("Written using PrintWriter.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Method 4: Read using FileReader
    public void readWithFileReader(String fileName) {
        try (FileReader fr = new FileReader(fileName)) {
            int ch;
            while ((ch = fr.read()) != -1) {
                System.out.print((char) ch);
            }
            System.out.println("\nRead using FileReader.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Method 5: Read using BufferedReader
    public void readWithBufferedReader(String fileName) {
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            System.out.println("Read using BufferedReader.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Method 6: Read using Scanner
    public void readWithScanner(String fileName) {
        try (Scanner sc = new Scanner(new File(fileName))) {
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
            System.out.println("Read using Scanner.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Method 7: Modern NIO Files API
    public void readWriteWithFiles(String fileName, String content) {
        Path path = Paths.get(fileName);
        try {
            Files.write(path, content.getBytes());
            System.out.println("Written using Files.write.");

            List<String> lines = Files.readAllLines(path);
            lines.forEach(System.out::println);
            System.out.println("Read using Files.readAllLines.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Main method to test all approaches
    public static void main(String[] args) {
        FileHandler fh = new FileHandler();

        String file = "demo.txt";
        String content = "Hello Pravin! This is a test file.";

        fh.writeWithFileWriter(file, content);
        fh.readWithFileReader(file);

        fh.writeWithBufferedWriter(file, content);
        fh.readWithBufferedReader(file);

        fh.writeWithPrintWriter(file, content);
        fh.readWithScanner(file);

        fh.readWriteWithFiles("demoNIO.txt", content);
    }
}
