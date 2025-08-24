package String.level_2;

import java.util.Random;

public class Scorecard {

    public static int[][] GenerateScores(int numStudents) {
        Random random = new Random();
        int[][] scores = new int[numStudents][3];  // Physics, Chemistry, Maths

        for (int i = 0; i < numStudents; i++) {
            scores[i][0] = 40 + random.nextInt(61);  // 40 to 100
            scores[i][1] = 40 + random.nextInt(61);
            scores[i][2] = 40 + random.nextInt(61);
        }
        return scores;
    }

    public static double[][] CalculateTotals(int[][] scores) {
        int n = scores.length;
        double[][] results = new double[n][3];  // total, average, percentage

        for (int i = 0; i < n; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double average = total / 3.0;
            double percentage = (total / 300.0) * 100;

            results[i][0] = Math.round(total * 100.0) / 100.0;
            results[i][1] = Math.round(average * 100.0) / 100.0;
            results[i][2] = Math.round(percentage * 100.0) / 100.0;
        }
        return results;
    }

    public static String[] CalculateGrades(double[][] results) {
        int n = results.length;
        String[] grades = new String[n];

        for (int i = 0; i < n; i++) {
            double percent = results[i][2];
            if (percent >= 80) grades[i] = "A";
            else if (percent >= 70) grades[i] = "B";
            else if (percent >= 60) grades[i] = "C";
            else if (percent >= 50) grades[i] = "D";
            else if (percent >= 40) grades[i] = "E";
            else grades[i] = "R";
        }
        return grades;
    }

    public static void DisplayScorecard(int[][] scores, double[][] results, String[] grades) {
        System.out.printf("%-10s %-8s %-10s %-8s %-8s %-8s %-8s\n", "Student", "Physics", "Chemistry", "Maths", "Total", "Avg", "Percent", "Grade");
        System.out.println("--------------------------------------------------------------------------------");
        for (int i = 0; i < scores.length; i++) {
            System.out.printf("%-10d %-8d %-10d %-8d %-8.2f %-8.2f %-8.2f %-8s\n",
                    (i + 1),
                    scores[i][0],
                    scores[i][1],
                    scores[i][2],
                    results[i][0],
                    results[i][1],
                    results[i][2],
                    grades[i]);
        }
    }

    public static void main(String[] args) {
        int numStudents = 10;
        int[][] scores = GenerateScores(numStudents);
        double[][] results = CalculateTotals(scores);
        String[] grades = CalculateGrades(results);
        DisplayScorecard(scores, results, grades);
    }
}

