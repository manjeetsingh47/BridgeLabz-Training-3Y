package String.level_2;

import java.util.Scanner;

public class StringLengthDemo {

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

    public static void main(String[] args) {
        Scanner ScannerObj = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String UserInput = ScannerObj.next();

        int ManualLength = GetLengthWithoutBuiltIn(UserInput);
        int BuiltInLength = UserInput.length();

        System.out.println("Manual Length:  " + ManualLength);
        System.out.println("Built-in Length: " + BuiltInLength);
    }
}

