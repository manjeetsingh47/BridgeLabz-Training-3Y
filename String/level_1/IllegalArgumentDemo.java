package String.level_1;

import java.util.Scanner;

public class IllegalArgumentDemo {

    public static void GenerateException(String Input) {
        String Sub = Input.substring(5, 2);
        System.out.println(Sub);
    }

    public static void HandleException(String Input) {
        try {
            String Sub = Input.substring(5, 2);
            System.out.println(Sub);
        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException Handled");
        } catch (RuntimeException e) {
            System.out.println("RuntimeException Handled");
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

