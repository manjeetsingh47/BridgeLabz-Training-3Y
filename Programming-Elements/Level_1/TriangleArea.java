package Level_1;
import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        double base, height, areaInInches, areaInCm;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter base of the triangle (in inches): ");
        base = input.nextDouble();

        System.out.print("Enter height of the triangle (in inches): ");
        height = input.nextDouble();

        areaInInches = 0.5 * base * height;
        areaInCm = areaInInches * 6.4516;

        System.out.println("The area of the triangle is " + areaInInches + " square inches and " + areaInCm + " square centimeters");

        input.close();
    }
}


