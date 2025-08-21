package Array.level_1;

import java.util.Scanner;

public class MultiplicationFrom6to9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;

        System.out.print("Enter a number: ");
        number = scanner.nextInt();

        int[] multiplicationResult = new int[4];

        for (int i = 0; i < 4; i++) {
            multiplicationResult[i] = number * (i + 6);
        }

        for (int i = 0; i < 4; i++) {
            System.out.println(number + " * " + (i + 6) + " = " + multiplicationResult[i]);
        }
    }
}

