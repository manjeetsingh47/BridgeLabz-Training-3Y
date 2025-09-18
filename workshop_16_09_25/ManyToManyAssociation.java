package workshop_16_09_25;


import java.util.ArrayList;
import java.util.List;


class Course {
    private String name;
    private List<Teacher> teachers;

    public Course(String name) {
        this.name = name;
        this.teachers = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public List<Teacher> getTeachers() {
        return teachers;
    }

    public void addTeacher(Teacher teacher) {
        if (!teachers.contains(teacher)) {
            teachers.add(teacher);
            teacher.addCourse(this); 
        }
    }
}


class Teacher {
    private String name;
    private List<Course> courses;

    public Teacher(String name) {
        this.name = name;
        this.courses = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public List<Course> getCourses() {
        return courses;
    }

    
    public void addCourse(Course course) {
        if (!courses.contains(course)) {
            courses.add(course);
            course.addTeacher(this);  
        }
    }
}


public class ManyToManyAssociation {
    public static void main(String[] args) {
        
        Teacher t1 = new Teacher("Alice");
        Teacher t2 = new Teacher("Bob");

        
        Course c1 = new Course("Math");
        Course c2 = new Course("Physics");
        Course c3 = new Course("Computer Science");

        
        t1.addCourse(c1);
        t1.addCourse(c2);
        t2.addCourse(c2);
        t2.addCourse(c3);

        
        for (Teacher t : new Teacher[]{t1, t2}) {
            System.out.print(t.getName() + " teaches: ");
            for (Course c : t.getCourses()) {
                System.out.print(c.getName() + " ");
            }
            System.out.println();
        }

        
        for (Course c : new Course[]{c1, c2, c3}) {
            System.out.print(c.getName() + " is taught by: ");
            for (Teacher t : c.getTeachers()) {
                System.out.print(t.getName() + " ");
            }
            System.out.println();
        }
    }
}
