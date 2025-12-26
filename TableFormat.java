import java.util.Scanner;

public class TableFormat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input number of records
        System.out.print("Enter number of records: ");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        // Arrays to store data
        int[] srNo = new int[n];
        String[] name = new String[n];
        int[] age = new int[n];
        String[] gender = new String[n];
        String[] phone = new String[n];
        String[] education = new String[n];

        // Input data
        for (int i = 0; i < n; i++) {
            srNo[i] = i + 1;
            System.out.print("Enter name: ");
            name[i] = sc.nextLine();
            System.out.print("Enter age: ");
            age[i] = sc.nextInt();
            sc.nextLine(); // consume newline
            System.out.print("Enter gender: ");
            gender[i] = sc.nextLine();
            System.out.print("Enter phone number: ");
            phone[i] = sc.nextLine();
            System.out.print("Enter education: ");
            education[i] = sc.nextLine();
            System.out.println();
        }

        // Print table header
        System.out.printf("%-5s %-15s %-5s %-10s %-15s %-15s%n",
                "SrNo", "Name", "Age", "Gender", "Phone", "Education");
        System.out.println("---------------------------------------------------------------");

        // Print table rows
        for (int i = 0; i < n; i++) {
            System.out.printf("%-5d %-15s %-5d %-10s %-15s %-15s%n",
                    srNo[i], name[i], age[i], gender[i], phone[i], education[i]);
        }

        sc.close();
    }
}