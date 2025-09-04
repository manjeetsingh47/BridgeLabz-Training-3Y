package Constructor.AccessModifier;

public class Student {
    public int rollNumber;
    protected String name;
    private double CGPA;

    public Student(int rollNumber, String name, double CGPA) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.CGPA = CGPA;
    }

    public double getCGPA() {
        return CGPA;
    }

    public void setCGPA(double CGPA) {
        this.CGPA = CGPA;
    }
}

class PostgraduateStudent extends Student {

    public PostgraduateStudent(int rollNumber, String name, double CGPA) {
        super(rollNumber, name, CGPA);
    }

    public void displayDetails() {
        
        System.out.println("Postgraduate Student Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("CGPA: " + getCGPA());
    }

    public void changeName(String newName) {
        
        this.name = newName;
    }
}

class Main {
    public static void main(String[] args) {
        PostgraduateStudent pgStudent = new PostgraduateStudent(101, "Alice", 9.2);
        pgStudent.displayDetails();

        pgStudent.changeName("Alice Smith");
        pgStudent.setCGPA(9.5);

        System.out.println("\nAfter updates:");
        pgStudent.displayDetails();
    }
}

