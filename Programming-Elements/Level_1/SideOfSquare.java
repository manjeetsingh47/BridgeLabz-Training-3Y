package Level_1;

import java.util.Scanner;

public class SideOfSquare {
    public static void main(String[] args) {
        double perimeter, side;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the perimeter of the square: ");
        perimeter = input.nextDouble();

        side = perimeter / 4;

        System.out.println("The length of the side is " + side + " whose perimeter is " + perimeter);

        input.close();
    }
}

