package Level_1;
import java.util.Scanner;


public class FeeDiscountCalculator {

    public static void main(String[] args) {
        double fee, discountPercent, discount, finalFee;
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the student fee (INR): ");
        fee = input.nextDouble();
        
        System.out.print("Enter the university discount percentage: ");
        discountPercent = input.nextDouble();
        
        discount = (fee * discountPercent) / 100;
        finalFee = fee - discount;
        
        System.out.println("The discount amount is INR " + discount + " and final discounted fee is INR " + finalFee);
        
        input.close();
    }
}


