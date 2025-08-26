package String.level_3;

import java.util.Scanner;

public class UniqueCharactersFinder {

    // Method to find the length of the string without using .length()
    public static int getLength(String text) {
        int length = 0;
        try {
            while (true) {
                text.charAt(length);
                length++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            // Reached the end of the string
        }
        return length;
    }

    // Method to find unique characters using charAt()
    public static char[] findUniqueCharacters(String text) {
        int len = getLength(text);
        char[] tempUnique = new char[len];
        int uniqueCount = 0;

        for (int i = 0; i < len; i++) {
            char currentChar = text.charAt(i);
            boolean isUnique = true;

            for (int j = 0; j < i; j++) {
                if (text.charAt(j) == currentChar) {
                    isUnique = false;
                    break;
                }
            }

            if (isUnique) {
                tempUnique[uniqueCount] = currentChar;
                uniqueCount++;
            }
        }

        // Create the final array with only the unique characters
        char[] uniqueCharacters = new char[uniqueCount];
        for (int i = 0; i < uniqueCount; i++) {
            uniqueCharacters[i] = tempUnique[i];
        }

        return uniqueCharacters;
    }

    // Main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get input from user
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Find unique characters
        char[] result = findUniqueCharacters(input);

        // Display result
        System.out.print("Unique characters: ");
        for (char c : result) {
            System.out.print(c + " ");
        }
    }
}
