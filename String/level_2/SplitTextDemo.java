package String.level_2;

import java.util.Scanner;

public class SplitTextDemo {

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

        // Count words by counting spaces + 1
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

    public static boolean CompareStringArrays(String[] Arr1, String[] Arr2) {
        if (Arr1.length != Arr2.length) return false;

        for (int i = 0; i < Arr1.length; i++) {
            if (!Arr1[i].equals(Arr2[i])) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner ScannerObj = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String UserInput = ScannerObj.nextLine();

        String[] BuiltInSplit = UserInput.split(" ");
        String[] CustomSplitResult = CustomSplit(UserInput);

        boolean IsSame = CompareStringArrays(BuiltInSplit, CustomSplitResult);

        System.out.println("Built-in split:");
        for (String word : BuiltInSplit) {
            System.out.println(word);
        }

        System.out.println("Custom split:");
        for (String word : CustomSplitResult) {
            System.out.println(word);
        }

        System.out.println("Are both splits equal? " + IsSame);
    }
}
