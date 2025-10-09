 class Student {
    // 1. private variables (data hiding)
    private String name;
    private int age;

    // 2. public getters (read access)
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // 3. public setters (write access)
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        if(age > 0) {
            this.age = age;
        } else {
            System.out.println("Invalid age");
        }
    }
}
public class practice4 {
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("Amit");
        s.setAge(20);

        System.out.println("Name: " + s.getName());
        System.out.println("Age: " + s.getAge());
    }
}

