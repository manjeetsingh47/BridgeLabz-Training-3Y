package String.level_3;

import java.util.Scanner;

public class CharacterFrequency {

   
    public static Object[][] findCharacterFrequencies(String text) {
        int[] freq = new int[256]; // ASCII character frequency array

        int length = 0;
        try {
            while (true) {
                char ch = text.charAt(length);
                freq[ch]++;
                length++;
            }
        } catch (StringIndexOutOfBoundsException e) {
        }

        Object[][] result = new Object[length][2];
        boolean[] added = new boolean[256];
        int index = 0;

        for (int i = 0; i < length; i++) {
            char ch = text.charAt(i);
            if (!added[ch]) {
                result[index][0] = ch;
                result[index][1] = freq[ch];
                added[ch] = true;
                index++;
            }
        }

        Object[][] trimmedResult = new Object[index][2];
        for (int i = 0; i < index; i++) {
            trimmedResult[i][0] = result[i][0];
            trimmedResult[i][1] = result[i][1];
        }

        return trimmedResult;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        Object[][] frequencies = findCharacterFrequencies(input);

        System.out.println("Character frequencies:");
        for (Object[] pair : frequencies) {
            System.out.println(pair[0] + " : " + pair[1]);
        }
    }
}

