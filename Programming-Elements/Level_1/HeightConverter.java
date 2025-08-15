package Level_1;
import java.util.Scanner;

public class HeightConverter {
    public static void main(String[] args) {
        double heightCm, totalInches, feet, inches;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your height in centimeters: ");
        heightCm = input.nextDouble();

        totalInches = heightCm / 2.54;
        feet = Math.floor(totalInches / 12);
        inches = totalInches % 12;

        System.out.println("Your Height in cm is " + heightCm + " while in feet is " + (int)feet + " and inches is " + inches);

        input.close();
    }
}


