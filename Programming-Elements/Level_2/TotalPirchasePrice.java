package Level_2;

import java.util.Scanner;

public class TotalPirchasePrice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the unit price (INR): ");
        double unitPrice = scanner.nextDouble();

        System.out.print("Enter the quantity: ");
        int quantity = scanner.nextInt();

        double totalPrice = unitPrice * quantity;

        System.out.println("The total purchase price is INR " + totalPrice +
                " if the quantity " + quantity + " and unit price is INR " + unitPrice);

        scanner.close();
    }
}

