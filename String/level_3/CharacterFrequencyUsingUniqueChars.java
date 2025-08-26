package String.level_3;

import java.util.Scanner;

public class CharacterFrequencyUsingUniqueChars {

    public static char[] uniqueCharacters(String text) {
        int length = 0;
        try {
            while (true) {
                text.charAt(length);
                length++;
            }
        } catch (StringIndexOutOfBoundsException e) {
        }

        char[] temp = new char[length];
        int uniqueCount = 0;

        for (int i = 0; i < length; i++) {
            char currentChar = text.charAt(i);
            boolean isUnique = true;
            for (int j = 0; j < i; j++) {
                if (text.charAt(j) == currentChar) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                temp[uniqueCount] = currentChar;
                uniqueCount++;
            }
        }

        char[] uniqueChars = new char[uniqueCount];
        for (int i = 0; i < uniqueCount; i++) {
            uniqueChars[i] = temp[i];
        }

        return uniqueChars;
    }

    public static String[][] findFrequencies(String text) {
        int[] freq = new int[256];

        int i = 0;
        try {
            while (true) {
                char ch = text.charAt(i);
                freq[ch]++;
                i++;
            }
        } catch (StringIndexOutOfBoundsException e) {
        }

        char[] uniqueChars = uniqueCharacters(text);

        String[][] result = new String[uniqueChars.length][2];
        for (int j = 0; j < uniqueChars.length; j++) {
            result[j][0] = String.valueOf(uniqueChars[j]);
            result[j][1] = String.valueOf(freq[uniqueChars[j]]);
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        String[][] frequencies = findFrequencies(input);
        System.out.println("Character frequencies:");
        for (String[] pair : frequencies) {
            System.out.println(pair[0] + " : " + pair[1]);
        }
    }
}
