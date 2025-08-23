package String.level_1;

import java.util.Scanner;

public class StringIndexDemo {

    public static void GenerateException(String Input) {
        char ch = Input.charAt(100);
        System.out.println(ch);
    }

    public static void HandleException(String Input) {
        try {
            char ch = Input.charAt(100);
            System.out.println(ch);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Exception Handled");
        }
    }

    public static void main(String[] args) {
        Scanner ScannerObj = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String UserInput = ScannerObj.nextLine();

        // GenerateException(UserInput); 
        HandleException(UserInput);
    }
}

