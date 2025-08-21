package Array.level_2;

import java.util.Scanner;

public class BMICalculatorMultiArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of persons: ");
        int number = scanner.nextInt();

        double[][] personData = new double[number][3]; // [][0]=height, [][1]=weight, [][2]=BMI
        String[] weightStatus = new String[number];

        for (int i = 0; i < number; i++) {
            System.out.println("\nEnter details for person " + (i + 1) + ":");

            double height;
            do {
                System.out.print("Enter height in meters: ");
                height = scanner.nextDouble();
                if (height <= 0) {
                    System.out.println("Height must be a positive number. Try again.");
                }
            } while (height <= 0);

            double weight;
            do {
                System.out.print("Enter weight in kg: ");
                weight = scanner.nextDouble();
                if (weight <= 0) {
                    System.out.println("Weight must be a positive number. Try again.");
                }
            } while (weight <= 0);

            double bmi = weight / (height * height);

            personData[i][0] = height;
            personData[i][1] = weight;
            personData[i][2] = bmi;

            if (bmi <= 18.4) {
                weightStatus[i] = "Underweight";
            } else if (bmi <= 24.9) {
                weightStatus[i] = "Normal";
            } else if (bmi <= 39.9) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }

        System.out.println("\n-------- BMI REPORT --------");
        System.out.printf("%-12s %-12s %-10s %-15s\n", "Height(m)", "Weight(kg)", "BMI", "Status");

        for (int i = 0; i < number; i++) {
            System.out.printf("%-12.2f %-12.2f %-10.2f %-15s\n",
                    personData[i][0], personData[i][1], personData[i][2], weightStatus[i]);
        }
    }
}

