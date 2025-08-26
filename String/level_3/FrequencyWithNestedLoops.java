package String.level_3;

import java.util.Scanner;

public class FrequencyWithNestedLoops {

    public static String[] findFrequencies(String text) {
        char[] chars = text.toCharArray();
        int length = chars.length;
        int[] freq = new int[length];

        for (int i = 0; i < length; i++) {
            freq[i] = 1;
            if (chars[i] == '0') continue;
            for (int j = i + 1; j < length; j++) {
                if (chars[i] == chars[j]) {
                    freq[i]++;
                    chars[j] = '0';
                }
            }
        }

        int resultCount = 0;
        for (int i = 0; i < length; i++) {
            if (chars[i] != '0') {
                resultCount++;
            }
        }

        String[] result = new String[resultCount];
        int index = 0;
        for (int i = 0; i < length; i++) {
            if (chars[i] != '0') {
                result[index] = chars[i] + " : " + freq[i];
                index++;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        String[] frequencies = findFrequencies(input);
        System.out.println("Character frequencies:");
        for (String line : frequencies) {
            System.out.println(line);
        }
    }
}
