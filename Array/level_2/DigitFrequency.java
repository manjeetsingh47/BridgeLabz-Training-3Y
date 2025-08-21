package Array.level_2;
import java.util.Scanner;

public class DigitFrequency {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        long number = scanner.nextLong();

        // Handle negative input by taking absolute value
        number = Math.abs(number);

        // Count digits in the number
        int temp = (int) number;
        int count = 0;
        if (number == 0) {
            count = 1;
        } else {
            while (temp > 0) {
                temp /= 10;
                count++;
            }
        }

        // Array to store digits
        int[] digits = new int[count];

        // Extract digits and store in array
        long numCopy = number;
        for (int i = count - 1; i >= 0; i--) {
            digits[i] = (int)(numCopy % 10);
            numCopy /= 10;
        }

        // Frequency array for digits 0 to 9
        int[] frequency = new int[10];

        // Calculate frequency
        for (int i = 0; i < count; i++) {
            frequency[digits[i]]++;
        }

        // Display frequency of each digit
        System.out.println("Digit frequencies:");
        for (int i = 0; i < 10; i++) {
            if (frequency[i] > 0) {
                System.out.println(i + " occurs " + frequency[i] + " time(s)");
            }
        }
    }
}

