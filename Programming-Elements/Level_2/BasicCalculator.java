package Level_2;

import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        float number1 = scanner.nextFloat();

        System.out.print("Enter the second number: ");
        float number2 = scanner.nextFloat();

        float addition = number1 + number2;
        float subtraction = number1 - number2;
        float multiplication = number1 * number2;
        float division;

        if (number2 != 0) {
            division = number1 / number2;
        } else {
            division = Float.NaN;
        }

        System.out.println("\nThe addition, subtraction, multiplication, and division value of 2 numbers "
                + number1 + " and " + number2 + " is:");
        System.out.println("Addition: " + addition);
        System.out.println("Subtraction: " + subtraction);
        System.out.println("Multiplication: " + multiplication);
        if (number2 != 0) {
            System.out.println("Division: " + division);
        } else {
            System.out.println("Division: Undefined (division by zero)");
        }

        scanner.close();
    }
}
