package String.level_3;

import java.util.Scanner;

public class AnagramChecker {

    public static boolean areAnagrams(String text1, String text2) {
        int length1 = 0, length2 = 0;

        try {
            while (true) {
                text1.charAt(length1);
                length1++;
            }
        } catch (StringIndexOutOfBoundsException e) {}

        try {
            while (true) {
                text2.charAt(length2);
                length2++;
            }
        } catch (StringIndexOutOfBoundsException e) {}

        if (length1 != length2) return false;

        int[] freq1 = new int[256];
        int[] freq2 = new int[256];

        for (int i = 0; i < length1; i++) {
            freq1[text1.charAt(i)]++;
            freq2[text2.charAt(i)]++;
        }

        for (int i = 0; i < 256; i++) {
            if (freq1[i] != freq2[i]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first text: ");
        String input1 = scanner.nextLine();
        System.out.print("Enter second text: ");
        String input2 = scanner.nextLine();

        boolean result = areAnagrams(input1, input2);
        System.out.println("Are the texts anagrams? " + result);
    }
}
