package workshop_28_8_25;

import java.util.Scanner;

public class OnlineShopping {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        boolean check=true;
        int totalitem=0;
    while (check) {
     System.out.println("welcome to online cart ");
     System.out.println("1:laptop [price:3000]");
     System.out.println("2:books  (price:2000");
     System.out.println("3:clothes  (price:1500)");
     System.out.println("4:keyboard (price:800)");
     System.out.println("5:toys   (price:500)");
     System.out.println();
     
     do {
         System.out.println("Enter number of items you want to buy (min 1): ");
                totalitem = sc.nextInt();
     } while (totalitem<1);
     int total=0;
     for(int i=0;i<totalitem;i++){
        System.out.println("enter choice for item "+i);
        int choice=sc.nextInt();
        switch (choice) {
            case 1:
                total+=3000;
                break;
             case 2:
                total+=2000;
                break;
             case 3:
                total+=1500;
                break;
             case 4:
                total+=800;
                break;
             case 5:
                total+=500;
                break;
            default:
            System.out.println("invalid choice ");
            i--;
                break;
        }
     }
     if (total>=5000) {
        total-=total*0.1;
        System.out.println("you got 10% discount "+"(payable amount:"+total);
     }
     else{
        System.out.println("final price: "+total);
     }
     sc.nextLine();

     System.out.println("are there more customer(yes/no)");
     String reply=sc.nextLine();
     if (!reply.equals("yes")) {
        check=false;
     }
    }
    
    }
}
