package StaticProblems;

public class VehicleRegistration {
    private static double registrationFee = 500.00;

    private final String registrationNumber;
    private String ownerName;
    private String vehicleType;

    public VehicleRegistration(String ownerName, String vehicleType, String registrationNumber) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
        this.registrationNumber = registrationNumber;
    }

    public static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
        System.out.println("Updated Registration Fee: $" + registrationFee);
    }

    public void displayRegistrationDetails() {
        if (this instanceof VehicleRegistration) {
            System.out.println("Owner Name: " + ownerName);
            System.out.println("Vehicle Type: " + vehicleType);
            System.out.println("Registration Number: " + registrationNumber);
            System.out.println("Registration Fee: $" + registrationFee);
        } else {
            System.out.println("Invalid vehicle instance.");
        }
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public static void main(String[] args) {
        VehicleRegistration v1 = new VehicleRegistration("Nikhil Sharma", "Car", "REG12345");
        VehicleRegistration v2 = new VehicleRegistration("Anita Roy", "Motorcycle", "REG67890");

        System.out.println("\nVehicle 1 Registration Details:");
        v1.displayRegistrationDetails();

        System.out.println("\nVehicle 2 Registration Details:");
        v2.displayRegistrationDetails();

        VehicleRegistration.updateRegistrationFee(600.00);

        System.out.println("\nVehicle 1 Details After Fee Update:");
        v1.displayRegistrationDetails();
    }
}


