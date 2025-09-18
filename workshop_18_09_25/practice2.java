

//abstraction

abstract class Animal1 {
    abstract void makeSound();  

    void sleep() {              
        System.out.println("Sleeping...");
    }
}

class Dog1 extends Animal1 {
    @Override
    void makeSound() {
        System.out.println("Dog barks");
    }
}



public class practice2 {
    public static void main(String[] args) {
        Animal1 a = new Dog1();   
        a.makeSound();          
        a.sleep();              
    }
}
