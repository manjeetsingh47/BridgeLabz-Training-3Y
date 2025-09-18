
// Parent (superclass)
class Animal {
    void eat() {
        System.out.println("Animal eats");
    }
}

// Child (subclass) inherits from Animal
class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks");
    }
}

// Main class to test inheritance
public class practice {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();   // Inherited from Animal
        d.bark();  // Own method
    }
}
