package Array.level_2;

import java.util.Scanner;

public class bonus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[][] employeeData = new double[10][2]; 
        double[] bonuses = new double[10];
        double[] newSalaries = new double[10];
        double totalBonus = 0;
        double totalOldSalary = 0;
        double totalNewSalary = 0;

        for (int i = 0; i < 10; i++) {
            System.out.println("Enter salary for employee " + (i + 1) + ":");
            double salary = scanner.nextDouble();
            System.out.println("Enter years of service for employee " + (i + 1) + ":");
            double years = scanner.nextDouble();

            if (salary <= 0 || years < 0) {
                System.out.println("Invalid input. Please enter positive values.");
                i--;
                continue;
            }

            employeeData[i][0] = salary;
            employeeData[i][1] = years;
        }

        for (int i = 0; i < 10; i++) {
            double salary = employeeData[i][0];
            double years = employeeData[i][1];
            double bonus;

            if (years > 5) {
                bonus = salary * 0.05;
            } else {
                bonus = salary * 0.02;
            }

            double newSalary = salary + bonus;
            bonuses[i] = bonus;
            newSalaries[i] = newSalary;

            totalBonus += bonus;
            totalOldSalary += salary;
            totalNewSalary += newSalary;
        }

        System.out.println("Total Bonus Payout: " + totalBonus);
        System.out.println("Total Old Salary: " + totalOldSalary);
        System.out.println("Total New Salary: " + totalNewSalary);
    }
}


