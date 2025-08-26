package String.level_3;

import java.util.Scanner;

public class BMIcalculator {

    
    public static String[][] CalculateBMIStatus(double[][] heightWeight) {
        int n = heightWeight.length;
        String[][] result = new String[n][4]; 

        for (int i = 0; i < n; i++) {
            double weight = heightWeight[i][0];
            double heightCm = heightWeight[i][1];
            double heightM = heightCm / 100.0;

            double bmi = weight / (heightM * heightM);
            bmi = Math.round(bmi * 100.0) / 100.0;

            String status;
            if (bmi <= 18.4) status = "Underweight";
            else if (bmi <= 24.9) status = "Normal";
            else if (bmi <= 39.9) status = "Overweight";
            else status = "Obese";

            result[i][0] = String.valueOf(heightCm);
            result[i][1] = String.valueOf(weight);
            result[i][2] = String.valueOf(bmi);
            result[i][3] = status;
        }
        return result;
    }

    public static void DisplayBMI(String[][] data) {
        System.out.printf("%-10s %-10s %-10s %-12s\n", "Height(cm)", "Weight(kg)", "BMI", "Status");
        System.out.println("-----------------------------------------------------");
        for (String[] row : data) {
            System.out.printf("%-10s %-10s %-10s %-12s\n", row[0], row[1], row[2], row[3]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] heightWeight = new double[10][2];

        System.out.println("Enter weight (kg) and height (cm) for 10 persons:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Person " + (i + 1) + " weight: ");
            heightWeight[i][0] = sc.nextDouble();
            System.out.print("Person " + (i + 1) + " height: ");
            heightWeight[i][1] = sc.nextDouble();
        }

        String[][] bmiData = CalculateBMIStatus(heightWeight);
        DisplayBMI(bmiData);
    }
}

