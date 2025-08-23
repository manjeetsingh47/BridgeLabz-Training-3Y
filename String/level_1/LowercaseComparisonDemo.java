package String.level_1;

import java.util.Scanner;

public class LowercaseComparisonDemo {

    public static String ConvertToLowercase(String Text) {
        String Result = "";
        for (int i = 0; i < Text.length(); i++) {
            char Ch = Text.charAt(i);
            if (Ch >= 'A' && Ch <= 'Z') {
                Ch = (char)(Ch + 32);
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

        String BuiltInLower = UserInput.toLowerCase();
        String ManualLower = ConvertToLowercase(UserInput);

        boolean IsSame = CompareStrings(BuiltInLower, ManualLower);

        System.out.println("Built-in Lowercase: " + BuiltInLower);
        System.out.println("Manual Lowercase:   " + ManualLower);
        System.out.println("Are both equal? " + IsSame);
    }
}
