// CoreJavaConcepts.java
// Demonstrates important Core Java concepts in one program

// Base class (Inheritance + Encapsulation)
class Person {
    private String name; // encapsulated field
    private int age;

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter and Setter (Encapsulation)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // Method (to be overridden)
    public void introduce() {
        System.out.println("Hi, I am " + name + ", age " + age);
    }
}

// Derived class (Inheritance + Method Overriding)
class Student extends Person {
    private String course;

    public Student(String name, int age, String course) {
        super(name, age); // call parent constructor
        this.course = course;
    }

    // Overriding method
    @Override
    public void introduce() {
        System.out.println("Hello, I am " + getName() + ", studying " + course);
    }

    // Method overloading (same name, different parameters)
    public void study() {
        System.out.println(getName() + " is studying " + course);
    }

    public void study(int hours) {
        System.out.println(getName() + " studied " + course + " for " + hours + " hours.");
    }
}

// Utility class (Static methods)
class MathUtils {
    // Static method
    public static int factorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}

public class CoreJavaConcepts {
    public static void main(String[] args) {
        // Object creation
        Person p1 = new Person("Alice", 30);
        Student s1 = new Student("Bob", 20, "Computer Science");

        // Method calls
        p1.introduce(); // calls Person's method
        s1.introduce(); // calls overridden method in Student

        // Polymorphism (dynamic method dispatch)
        Person ref;
        ref = s1; // parent reference to child object
        ref.introduce(); // calls Student's version (runtime polymorphism)

        // Method overloading
        s1.study();
        s1.study(3);

        // Static method usage
        int num = 5;
        System.out.println("Factorial of " + num + " = " + MathUtils.factorial(num));

        // Control structures
        int choice = 2;
        switch (choice) {
            case 1:
                System.out.println("Choice is 1");
                break;
            case 2:
                System.out.println("Choice is 2");
                break;
            default:
                System.out.println("Invalid choice");
        }
    }
}