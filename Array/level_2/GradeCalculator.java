package Array.level_2;

import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = scanner.nextInt();

        int[][] marks = new int[n][3]; // 0: Physics, 1: Chemistry, 2: Maths
        double[] percentages = new double[n];
        char[] grades = new char[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter marks for student " + (i + 1) + ":");

            for (int j = 0; j < 3; j++) {
                String subject = j == 0 ? "Physics" : (j == 1 ? "Chemistry" : "Maths");
                System.out.print(subject + " marks: ");
                int mark = scanner.nextInt();

                if (mark < 0 || mark > 100) {
                    System.out.println("Invalid marks. Please enter marks between 0 and 100.");
                    j--; // Repeat this subject input
                    continue;
                }

                marks[i][j] = mark;
            }

            int total = marks[i][0] + marks[i][1] + marks[i][2];
            percentages[i] = total / 3.0;

            double percentage = percentages[i];

            if (percentage >= 80) {
                grades[i] = 'A';
            } else if (percentage >= 70) {
                grades[i] = 'B';
            } else if (percentage >= 60) {
                grades[i] = 'C';
            } else if (percentage >= 50) {
                grades[i] = 'D';
            } else if (percentage >= 40) {
                grades[i] = 'E';
            } else {
                grades[i] = 'R';
            }
        }

        System.out.println("\n------- Student Report -------");
        System.out.printf("%-10s %-10s %-10s %-12s %-10s %-6s\n", 
                "Physics", "Chemistry", "Maths", "Percentage", "Total", "Grade");

        for (int i = 0; i < n; i++) {
            int total = marks[i][0] + marks[i][1] + marks[i][2];
            System.out.printf("%-10d %-10d %-10d %-12.2f %-10d %-6c\n",
                    marks[i][0], marks[i][1], marks[i][2], percentages[i], total, grades[i]);
        }
    }
}

