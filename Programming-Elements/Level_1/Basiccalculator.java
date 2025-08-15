package Level_1;
import java.util.Scanner;

public class Basiccalculator {
    public static void main(String[] args) {
        double number1, number2, sum, difference, product, quotient;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        number1 = input.nextDouble();

        System.out.print("Enter second number: ");
        number2 = input.nextDouble();

        sum = number1 + number2;
        difference = number1 - number2;
        product = number1 * number2;
        quotient = number2 != 0 ? number1 / number2 : Double.NaN;

        System.out.println("The addition, subtraction, multiplication and division value of 2 numbers " 
            + number1 + " and " + number2 + " is " 
            + sum + ", " + difference + ", " + product + ", and " + quotient);

        input.close();
    }
}

