package String.level_2;

import java.util.Random;
import java.util.Scanner;

public class VotingEligibility {

    public static int[] GenerateRandomAges(int n) {
        int[] ages = new int[n];
        Random rand = new Random();
        for (int i = 0; i < n; i++) {
            // generate ages from -10 to 99 for demonstration (includes negative values)
            ages[i] = rand.nextInt(110) - 10;
        }
        return ages;
    }

    public static String[][] CheckVotingEligibility(int[] ages) {
        int length = ages.length;
        String[][] result = new String[length][2];

        for (int i = 0; i < length; i++) {
            int age = ages[i];
            result[i][0] = Integer.toString(age);

            if (age < 0) {
                result[i][1] = "False"; // Negative age can't vote
            } else if (age >= 18) {
                result[i][1] = "True";
            } else {
                result[i][1] = "False";
            }
        }
        return result;
    }

    public static void DisplayTable(String[][] arr) {
        System.out.printf("%-10s | %-10s\n", "Age", "Can Vote");
        System.out.println("----------------------");
        for (String[] row : arr) {
            System.out.printf("%-10s | %-10s\n", row[0], row[1]);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = scanner.nextInt();

        int[] ages = GenerateRandomAges(n);

        System.out.println("\nGenerated Ages:");
        for (int age : ages) {
            System.out.print(age + " ");
        }
        System.out.println("\n");

        String[][] eligibility = CheckVotingEligibility(ages);
        DisplayTable(eligibility);
    }
}

