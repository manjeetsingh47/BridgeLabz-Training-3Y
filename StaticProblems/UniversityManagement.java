package StaticProblems;

public class UniversityManagement {
    private static String universityName = "National University";
    private static int totalStudents = 0;

    private final String rollNumber;
    private String name;
    private String grade;

    public UniversityManagement(String name, String rollNumber, String grade) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.grade = grade;
        totalStudents++;
    }

    public static void displayTotalStudents() {
        System.out.println("Total Students Enrolled: " + totalStudents);
    }

    public void displayStudentDetails() {
        if (this instanceof UniversityManagement) {
            System.out.println("University: " + universityName);
            System.out.println("Name: " + name);
            System.out.println("Roll Number: " + rollNumber);
            System.out.println("Grade: " + grade);
        } else {
            System.out.println("Invalid student instance.");
        }
    }

    public void updateGrade(String newGrade) {
        if (this instanceof UniversityManagement) {
            this.grade = newGrade;
            System.out.println("Grade updated to: " + newGrade);
        } else {
            System.out.println("Cannot update grade. Invalid instance.");
        }
    }

    public String getName() {
        return name;
    }

    public String getGrade() {
        return grade;
    }

    public static void main(String[] args) {
        UniversityManagement s1 = new UniversityManagement("Ayesha Khan", "STU001", "A");
        UniversityManagement s2 = new UniversityManagement("Rohan Mehra", "STU002", "B+");

        System.out.println("\nStudent 1 Details:");
        s1.displayStudentDetails();

        System.out.println("\nStudent 2 Details:");
        s2.displayStudentDetails();

        UniversityManagement.displayTotalStudents();

        System.out.println("\nUpdating Grade for Student 2:");
        s2.updateGrade("A-");

        System.out.println("\nStudent 2 Updated Details:");
        s2.displayStudentDetails();
    }
}


