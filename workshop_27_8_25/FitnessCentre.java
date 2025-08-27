package workshop_27_8_25;
import java.util.*;

public class FitnessCentre {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean keepRunning = true;
        do {
            System.out.println("------Welocome To Fitness Center------");
            System.out.print("Enter number of members to register: ");
            int members = sc.nextInt();
            for (int i = 1; i <= members; i++){
                System.out.println("\nRegistering Member " + i);
                System.out.println("Select Membership Type:");
                System.out.println("1. Monthly (₹1000)");
                System.out.println("2. Quarterly (₹2500)");
                System.out.println("3. Yearly (₹9000)");
                int choice = sc.nextInt();
                int fee = 0;
                switch (choice) {
                    case 1: 
                    fee = 1000; 
                    break;
                    case 2: 
                    fee = 2500; 
                    break;
                    case 3: fee = 9000; 
                    break;
                    default: System.out.println("Invalid choice."); continue;
                }
                System.out.print("Are you a Student or Senior Citizen? (yes/no): ");
                String discount = sc.next();
                if (discount.equals("yes")) {
                    fee -= fee * 0.2;
                    System.out.println("Discount applied. Final Fee: ₹" + fee);
                } else {
                    System.out.println("No discount applied. Final Fee: ₹" + fee);
                }
            }
            System.out.print("\nDo you want to register more members? (yes/no): ");
            String Manager = sc.next();
            if (Manager.equals("no")) {
                keepRunning = false;
            }
        } while (keepRunning);
        System.out.println("Fitness Center Closed.");
    }
}