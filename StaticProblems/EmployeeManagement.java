package StaticProblems;

public class EmployeeManagement {
   
    private static String companyName = "Tech Solutions Ltd.";
    private static int totalEmployees = 0;

    private final String id;
    private String name;
    private String designation;

    public EmployeeManagement(String name, String id, String designation) {
        this.name = name;
        this.id = id;
        this.designation = designation;
        totalEmployees++;
    }

    public static void displayTotalEmployees() {
        System.out.println("Total Employees: " + totalEmployees);
    }

    public void displayEmployeeDetails() {
        if (this instanceof EmployeeManagement) {
            System.out.println("Company: " + companyName);
            System.out.println("Employee ID: " + id);
            System.out.println("Name: " + name);
            System.out.println("Designation: " + designation);
        } else {
            System.out.println("Invalid employee instance.");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public static void main(String[] args) {
        EmployeeManagement emp1 = new EmployeeManagement("Alice Johnson", "EMP001", "Software Engineer");
        EmployeeManagement emp2 = new EmployeeManagement("Bob Smith", "EMP002", "Project Manager");

        System.out.println("\nEmployee 1 Details:");
        emp1.displayEmployeeDetails();

        System.out.println("\nEmployee 2 Details:");
        emp2.displayEmployeeDetails();

        EmployeeManagement.displayTotalEmployees();
    }
}


