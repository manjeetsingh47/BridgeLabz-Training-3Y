package String.level_2;

import java.util.Scanner;

public class VowelConsonantChecker {

    public static String CheckCharType(char ch) {
        // Convert uppercase to lowercase using ASCII logic
        if (ch >= 'A' && ch <= 'Z') {
            ch = (char)(ch + 32);
        }
        if (ch >= 'a' && ch <= 'z') {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                return "Vowel";
            } else {
                return "Consonant";
            }
        }
        return "Not a Letter";
    }

    public static String[][] FindCharTypes(String text) {
        int length = 0;
        try {
            while (true) {
                text.charAt(length);
                length++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            // end of string reached
        }

        String[][] result = new String[length][2];
        for (int i = 0; i < length; i++) {
            char ch = text.charAt(i);
            result[i][0] = Character.toString(ch);
            result[i][1] = CheckCharType(ch);
        }
        return result;
    }

    public static void DisplayTable(String[][] arr) {
        System.out.printf("%-10s | %-15s\n", "Character", "Type");
        System.out.println("-----------------------------");
        for (String[] row : arr) {
            System.out.printf("%-10s | %-15s\n", row[0], row[1]);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        String[][] charTypes = FindCharTypes(input);
        DisplayTable(charTypes);
    }
}

