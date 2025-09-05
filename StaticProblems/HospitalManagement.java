package StaticProblems;

public class HospitalManagement {
    private static String hospitalName = "City Care Hospital";
    private static int totalPatients = 0;

    private final String patientID;
    private String name;
    private int age;
    private String ailment;

    public HospitalManagement(String name, int age, String ailment, String patientID) {
        this.name = name;
        this.age = age;
        this.ailment = ailment;
        this.patientID = patientID;
        totalPatients++;
    }

    public static void getTotalPatients() {
        System.out.println("Total Patients Admitted: " + totalPatients);
    }

    public void displayPatientDetails() {
        if (this instanceof HospitalManagement) {
            System.out.println("Hospital: " + hospitalName);
            System.out.println("Patient ID: " + patientID);
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Ailment: " + ailment);
        } else {
            System.out.println("Invalid patient instance.");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAilment() {
        return ailment;
    }

    public void setAilment(String ailment) {
        this.ailment = ailment;
    }

    public static void main(String[] args) {
        HospitalManagement p1 = new HospitalManagement("Rahul Verma", 45, "Fever", "PAT001");
        HospitalManagement p2 = new HospitalManagement("Sneha Iyer", 30, "Fracture", "PAT002");

        System.out.println("\nPatient 1 Details:");
        p1.displayPatientDetails();

        System.out.println("\nPatient 2 Details:");
        p2.displayPatientDetails();

        HospitalManagement.getTotalPatients();
    }
}


