package Level_1;

import java.util.Scanner;

public class DistanceConvereter {
    public static void main(String[] args) {
        double distanceInFeet, distanceInYards, distanceInMiles;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the distance in feet: ");
        distanceInFeet = input.nextDouble();

        distanceInYards = distanceInFeet / 3;
        distanceInMiles = distanceInYards / 1760;

        System.out.println("The distance in yards is " + distanceInYards + " and in miles is " + distanceInMiles + " for the given " + distanceInFeet + " feet");

        input.close();
    }
}
