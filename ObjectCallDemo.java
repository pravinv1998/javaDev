// Class 1: Student
class Student {
    private String name;
    private int age;

    // Constructor
    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display student details
    public void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

// Class 2: StudentService
class StudentService {
    // Method that accepts Student object and calls its method
    public void printStudentDetails(Student s) {
        System.out.println("Calling Student object from StudentService...");
        s.displayInfo(); // Object method call from another class
    }
}

// Class 3: Main class
public class ObjectCallDemo {
    public static void main(String[] args) {
        // Create Student object
        Student student1 = new Student("Pravin", 25);

        // Create StudentService object
        StudentService service = new StudentService();

        // Call method of StudentService, which internally calls Student's method
        service.printStudentDetails(student1);
    }
}