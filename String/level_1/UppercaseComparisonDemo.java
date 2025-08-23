package String.level_1;

import java.util.Scanner;

public class UppercaseComparisonDemo {

    public static String ConvertToUppercase(String Text) {
        String Result = "";
        for (int i = 0; i < Text.length(); i++) {
            char Ch = Text.charAt(i);
            if (Ch >= 'a' && Ch <= 'z') {
                Ch = (char)(Ch - 32);
            }
            Result += Ch;
        }
        return Result;
    }

    public static boolean CompareStrings(String Text1, String Text2) {
        if (Text1.length() != Text2.length()) {
            return false;
        }
        for (int i = 0; i < Text1.length(); i++) {
            if (Text1.charAt(i) != Text2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner ScannerObj = new Scanner(System.in);
        System.out.print("Enter a text: ");
        String UserInput = ScannerObj.nextLine();

        String BuiltInUpper = UserInput.toUpperCase();
        String ManualUpper = ConvertToUppercase(UserInput);

        boolean IsSame = CompareStrings(BuiltInUpper, ManualUpper);

        System.out.println("Built-in Uppercase: " + BuiltInUpper);
        System.out.println("Manual Uppercase:   " + ManualUpper);
        System.out.println("Are both equal? " + IsSame);
    }
}

