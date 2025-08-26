package String.level_2;

import java.util.Scanner;

public class WordLengthTable {

    public static int GetLengthWithoutBuiltIn(String Text) {
        int Count = 0;
        try {
            while (true) {
                Text.charAt(Count);
                Count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            return Count;
        }
    }

    public static String[] CustomSplit(String Text) {
        int Length = GetLengthWithoutBuiltIn(Text);

        int WordCount = 1;
        for (int i = 0; i < Length; i++) {
            if (Text.charAt(i) == ' ') {
                WordCount++;
            }
        }

        int[] SpaceIndexes = new int[WordCount - 1];
        int idx = 0;
        for (int i = 0; i < Length; i++) {
            if (Text.charAt(i) == ' ') {
                SpaceIndexes[idx++] = i;
            }
        }

        String[] Words = new String[WordCount];
        int start = 0;
        for (int i = 0; i < WordCount; i++) {
            int end = (i == WordCount - 1) ? Length : SpaceIndexes[i];
            String Word = "";
            for (int j = start; j < end; j++) {
                Word += Text.charAt(j);
            }
            Words[i] = Word;
            start = end + 1;
        }

        return Words;
    }

    public static String[][] GetWordsWithLengths(String[] Words) {
        String[][] Result = new String[Words.length][2];
        for (int i = 0; i < Words.length; i++) {
            Result[i][0] = Words[i];
            Result[i][1] = String.valueOf(GetLengthWithoutBuiltIn(Words[i]));
        }
        return Result;
    }

    public static void main(String[] args) {
        Scanner ScannerObj = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String UserInput = ScannerObj.nextLine();

        String[] Words = CustomSplit(UserInput);
        String[][] WordsWithLengths = GetWordsWithLengths(Words);

        System.out.printf("%-15s | %s\n", "Word", "Length");
        System.out.println("-----------------------");
        for (String[] pair : WordsWithLengths) {
            String Word = pair[0];
            int Length = Integer.parseInt(pair[1]);
            System.out.printf("%-15s | %d\n", Word, Length);
        }
    }
}

