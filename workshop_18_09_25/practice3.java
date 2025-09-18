

// class MyClass {
    
//     MyClass() {
//         System.out.println("Constructor called");
//     }
// }

// public class practice3 {
//     public static void main(String[] args) {
//         MyClass obj = new MyClass();  // Constructor gets called here
//     }
// }



class Person {
    String name;
    int age;

    // Parameterized constructor
    Person(String n, int a) {
        name = n;
        age = a;
    }

    void display() {
        System.out.println(name + " is " + age + " years old.");
    }
}
public class practice3 {
    public static void main(String[] args) {
        Person p1 = new Person("Alice", 25);
        p1.display();
    }
}
