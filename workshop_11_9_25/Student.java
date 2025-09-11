package workshop_11_9_25;



public class Student {
    private String name;
    private int age;
    private String grade;


public class StudentMain {
    public static void main(String[] args) {
        // Create students
        Student student1 = new Student("Riya", 20);
        Student student2 = new Student("Ankit", -5);  // Negative age

        // Update grades
        student1.updateGrade(85);  // B
        student2.updateGrade(102); // Invalid

        // Print student details
        System.out.println(student1);
        System.out.println(student2);

        // Updating with valid marks later
        student2.updateGrade(67);
        System.out.println("After updating marks:");
        System.out.println(student2);
    }
}


    // Constructor
    public Student(String name, int age) {
        this.name = name;
        setAge(age); // validate age here
        this.grade = "Not Graded"; // default grade
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGrade() {
        return grade;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        if (age < 0) {
            System.out.println("Age cannot be negative. Setting age to 0.");
            this.age = 0;
        } else {
            this.age = age;
        }
    }

    // Grade is updated only via marks
    public void updateGrade(int marks) {
        if (marks < 0 || marks > 100) {
            System.out.println("Invalid marks. Grade not updated.");
            return;
        }

        if (marks >= 90) {
            grade = "A";
        } else if (marks >= 80) {
            grade = "B";
        } else if (marks >= 70) {
            grade = "C";
        } else if (marks >= 60) {
            grade = "D";
        } else {
            grade = "F";
        }
    }

    // toString() for easy printing
    @Override
    public String toString() {
        return "Student [Name=" + name + ", Age=" + age + ", Grade=" + grade + "]";
    }
}



