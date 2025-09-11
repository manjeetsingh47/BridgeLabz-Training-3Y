package workshop_28_8_25;
import java.util.*;

public class LibraryManagement {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char moreStudents;

        // keep checking fines for multiple students
        while (true) {
            System.out.print("Enter Student Name: ");
            String student = sc.nextLine();

            System.out.print("Enter number of books borrowed: ");
            int books = sc.nextInt();

            int totalFine = 0;

            // for loop for multiple books
            for (int i = 1; i <= books; i++) {
                System.out.println("\nBook " + i + " category (1-Regular, 2-Reference, 3-Magazine): ");
                int category = sc.nextInt();

                // switch-case for book category
                switch (category) {
                    case 1:
                        System.out.println("Category: Regular");
                        break;
                    case 2:
                        System.out.println("Category: Reference");
                        break;
                    case 3:
                        System.out.println("Category: Magazine");
                        break;
                    default:
                        System.out.println("Invalid category");
                        break;
                }

                System.out.print("Enter days late: ");
                int daysLate = sc.nextInt();
                int fine = 0;

                // if-else for fine calculation
                if (daysLate >= 1 && daysLate <= 5) {
                    fine = daysLate * 10;
                } else if (daysLate >= 6 && daysLate <= 10) {
                    fine = daysLate * 20;
                } else if (daysLate > 10) {
                    fine = daysLate * 50;
                }

                System.out.println("Fine for this book = Rs" + fine);
                totalFine += fine;
            }

            // do-while to ensure calculation is shown
            do {
                System.out.println("\nTotal fine for " + student + " = Rs" + totalFine);
                break;
            } while (false);

            System.out.print("\nDo you want to calculate fine for another student? (y/n): ");
            moreStudents = sc.next().charAt(0);
            sc.nextLine(); // consume newline

            if (moreStudents == 'n' || moreStudents == 'N') {
                System.out.println("Exiting program...");
                break;
            }
        }

        sc.close();
    }
}

