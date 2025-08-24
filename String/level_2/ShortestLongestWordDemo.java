package String.level_2;

import java.util.Scanner;

public class ShortestLongestWordDemo {

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

    public static int[] FindShortestAndLongest(String[][] WordsWithLengths) {
        int MinIndex = 0;
        int MaxIndex = 0;
        int MinLength = Integer.MAX_VALUE;
        int MaxLength = Integer.MIN_VALUE;

        for (int i = 0; i < WordsWithLengths.length; i++) {
            int Len = Integer.parseInt(WordsWithLengths[i][1]);
            if (Len < MinLength) {
                MinLength = Len;
                MinIndex = i;
            }
            if (Len > MaxLength) {
                MaxLength = Len;
                MaxIndex = i;
            }
        }

        return new int[]{MinIndex, MaxIndex};
    }

    public static void main(String[] args) {
        Scanner ScannerObj = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String UserInput = ScannerObj.nextLine();

        String[] Words = CustomSplit(UserInput);
        String[][] WordsWithLengths = GetWordsWithLengths(Words);
        int[] ResultIndexes = FindShortestAndLongest(WordsWithLengths);

        int ShortestIndex = ResultIndexes[0];
        int LongestIndex = ResultIndexes[1];

        System.out.println("Shortest Word: " + WordsWithLengths[ShortestIndex][0] +
                " (Length: " + WordsWithLengths[ShortestIndex][1] + ")");
        System.out.println("Longest Word: " + WordsWithLengths[LongestIndex][0] +
                " (Length: " + WordsWithLengths[LongestIndex][1] + ")");
    }
}

