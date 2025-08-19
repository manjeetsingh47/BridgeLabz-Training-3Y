package Level_3;
import java.util.Scanner;

public class Leap_year {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = scanner.nextInt();

        if (year < 1582) {
            System.out.println("Year is not in the Gregorian calendar.");
        } else {
            if (year % 4 != 0) {
                System.out.println("Not a Leap Year");
            } else if (year % 100 != 0) {
                System.out.println("Leap Year");
            } else if (year % 400 == 0) {
                System.out.println("Leap Year");
            } else {
                System.out.println("Not a Leap Year");
            }
        }

        if (year >= 1582 && (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0))) {
            System.out.println("Leap Year");
        } else if (year < 1582) {
            System.out.println("Year is not in the Gregorian calendar.");
        } else {
            System.out.println("Not a Leap Year");
        }

        scanner.close();
    }
}

