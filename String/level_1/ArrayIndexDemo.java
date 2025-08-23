package String.level_1;

import java.util.Scanner;

public class ArrayIndexDemo {

    public static void GenerateException(String[] Names, int Index) {
        String Name = Names[Index];
        System.out.println(Name);
    }

    public static void HandleException(String[] Names, int Index) {
        try {
            String Name = Names[Index];
            System.out.println(Name);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException Handled");
        } catch (RuntimeException e) {
            System.out.println("RuntimeException Handled");
        }
    }

    public static void main(String[] args) {
        String[] NameArray = {"Alice", "Bob", "Charlie", "Diana"};
        Scanner ScannerObj = new Scanner(System.in);
        System.out.print("Enter an index: ");
        int UserIndex = ScannerObj.nextInt();

        // GenerateException(NameArray, UserIndex); 
        HandleException(NameArray, UserIndex);
    }
}

