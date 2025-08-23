package String.level_1;

import java.util.Scanner;

public class NumberFormatDemo {

    public static void GenerateException(String Input) {
        int Number = Integer.parseInt(Input);
        System.out.println(Number);
    }

    public static void HandleException(String Input) {
        try {
            int Number = Integer.parseInt(Input);
            System.out.println(Number);
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException Handled");
        } catch (RuntimeException e) {
            System.out.println("RuntimeException Handled");
        }
    }

    public static void main(String[] args) {
        Scanner ScannerObj = new Scanner(System.in);
        System.out.print("Enter a number: ");
        String UserInput = ScannerObj.nextLine();

        // GenerateException(UserInput); 
        HandleException(UserInput);
    }
}

