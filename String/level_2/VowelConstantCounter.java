package String.level_2;

import java.util.Scanner;

public class VowelConstantCounter {

    public static String CheckCharType(char Ch) {
        // Convert uppercase to lowercase
        if (Ch >= 'A' && Ch <= 'Z') {
            Ch = (char)(Ch + 32);
        }
        if (Ch >= 'a' && Ch <= 'z') {
            if (Ch == 'a' || Ch == 'e' || Ch == 'i' || Ch == 'o' || Ch == 'u') {
                return "Vowel";
            } else {
                return "Consonant";
            }
        }
        return "NotALetter";
    }

    public static int[] CountVowelsConsonants(String Text) {
        int VowelCount = 0;
        int ConsonantCount = 0;
        int Length = 0;
        try {
            while (true) {
                Text.charAt(Length);
                Length++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            // length found
        }

        for (int i = 0; i < Length; i++) {
            String Type = CheckCharType(Text.charAt(i));
            if (Type.equals("Vowel")) {
                VowelCount++;
            } else if (Type.equals("Consonant")) {
                ConsonantCount++;
            }
        }
        return new int[]{VowelCount, ConsonantCount};
    }

    public static void main(String[] args) {
        Scanner ScannerObj = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String UserInput = ScannerObj.nextLine();

        int[] Counts = CountVowelsConsonants(UserInput);
        System.out.println("Vowels: " + Counts[0]);
        System.out.println("Consonants: " + Counts[1]);
    }
}

