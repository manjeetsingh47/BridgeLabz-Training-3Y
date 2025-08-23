package String.level_2;

import java.util.Scanner;

public class CustomTrimDemo {

    public static int[] FindTrimIndices(String text) {
        int length = 0;
        try {
            while (true) {
                text.charAt(length);
                length++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            // end of string
        }

        int start = 0;
        while (start < length && text.charAt(start) == ' ') {
            start++;
        }

        int end = length - 1;
        while (end >= start && text.charAt(end) == ' ') {
            end--;
        }

        return new int[]{start, end};
    }

    public static String CustomSubstring(String text, int start, int end) {
        String result = "";
        for (int i = start; i <= end; i++) {
            result += text.charAt(i);
        }
        return result;
    }

    public static boolean CompareStrings(String str1, String str2) {
        int length1 = 0;
        int length2 = 0;

        try {
            while (true) {
                str1.charAt(length1);
                length1++;
            }
        } catch (StringIndexOutOfBoundsException e) {}

        try {
            while (true) {
                str2.charAt(length2);
                length2++;
            }
        } catch (StringIndexOutOfBoundsException e) {}

        if (length1 != length2) return false;

        for (int i = 0; i < length1; i++) {
            if (str1.charAt(i) != str2.charAt(i)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter text with spaces: ");
        String input = scanner.nextLine();

        int[] indices = FindTrimIndices(input);
        String trimmedCustom = "";
        if (indices[0] <= indices[1]) {
            trimmedCustom = CustomSubstring(input, indices[0], indices[1]);
        } else {
            // String is all spaces or empty
            trimmedCustom = "";
        }

        String trimmedBuiltIn = input.trim();

        System.out.println("Custom Trim Result: '" + trimmedCustom + "'");
        System.out.println("Built-in Trim Result: '" + trimmedBuiltIn + "'");

        boolean areEqual = CompareStrings(trimmedCustom, trimmedBuiltIn);
        System.out.println("Are both trims equal? " + areEqual);
    }
}

