// Demonstrating OOP concepts in one program
// Author: Pravin (example for learning)

abstract class Animal { // Abstraction
    private String name; // Encapsulation (private field)

    // Constructor
    public Animal(String name) {
        this.name = name;
    }

    // Getter (Encapsulation)
    public String getName() {
        return name;
    }

    // Abstract method (Abstraction)
    public abstract void sound();

    // Normal method
    public void eat() {
        System.out.println(name + " is eating.");
    }
}

// Inheritance: Dog inherits Animal
class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    // Polymorphism: overriding sound()
    @Override
    public void sound() {
        System.out.println(getName() + " says: Woof Woof!");
    }
}

// Inheritance: Cat inherits Animal
class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    // Polymorphism: overriding sound()
    @Override
    public void sound() {
        System.out.println(getName() + " says: Meow Meow!");
    }
}

public class OOPDemo {
    public static void main(String[] args) {
        // Polymorphism in action: same method behaves differently
        Animal dog = new Dog("Buddy");
        Animal cat = new Cat("Kitty");

        dog.sound(); // Woof Woof!
        cat.sound(); // Meow Meow!

        dog.eat(); // Buddy is eating.
        cat.eat(); // Kitty is eating.
    }
}