package String.level_1;

import java.util.Scanner;

public class CharacterArrayComparison {

    static char[] getCharacters(String text) {
        char[] result = new char[text.length()];
        for (int i = 0; i < text.length(); i++) {
            result[i] = text.charAt(i);
        }
        return result;
    }

    static boolean compareCharArrays(char[] a, char[] b) {
        if (a.length != b.length) return false;
        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();

        char[] userDefined = getCharacters(input);
        char[] builtIn = input.toCharArray();

        boolean areEqual = compareCharArrays(userDefined, builtIn);

        System.out.println("Characters using user-defined method:");
        for (char c : userDefined) System.out.print(c + " ");
        System.out.println("\nCharacters using toCharArray():");
        for (char c : builtIn) System.out.print(c + " ");
        System.out.println("\nArrays are equal: " + areEqual);
    }
}

