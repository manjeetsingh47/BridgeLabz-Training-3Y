package Constructor.Instance_Variables;

public class Course {
    String courseName;
    int duration;  
    double fee;
    static String instituteName;

    public Course(String courseName, int duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

    public void displayCourseDetails() {
        System.out.println("Institute: " + instituteName);
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + duration);
        System.out.println("Fee: $" + fee);
    }

    public static void updateInstituteName(String newInstituteName) {
        instituteName = newInstituteName;
    }

    public static void main(String[] args) {
        Course.updateInstituteName("Global Tech Academy");

        Course c1 = new Course("Java Programming", 12, 1200.00);
        Course c2 = new Course("Data Science", 10, 1500.00);

        c1.displayCourseDetails();
        System.out.println();
        c2.displayCourseDetails();

        Course.updateInstituteName("Tech Innovators Institute");
        System.out.println("\nAfter updating institute name:\n");

        c1.displayCourseDetails();
        System.out.println();
        c2.displayCourseDetails();
    }
}

