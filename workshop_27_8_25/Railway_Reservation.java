package workshop_27_8_25;

import java.util.Scanner;

public class Railway_Reservation {

     static Scanner sc=new Scanner(System.in);

     static void trains(){
        System.out.println("-----------------WELCOME TO INDIAN RAILWAYS----------------");
        System.out.println();
        System.out.println("choose a train: ");
        System.out.println("type 1: for VandeBharat      (Fare:2000rs) ");
        System.out.println("type 2: for BulletTrain      (Fare:1500rs)");
        System.out.println("type 3: for RajDhani Express (Fare:1000rs)");
         System.out.println("enter your choice: ");
        int trainChoice=sc.nextInt();
        int fare=0,capacity=0;
        switch (trainChoice) {
            case 1:
                fare=2000;
                capacity=2;
                System.out.println("you selected VandeBharat (fare: "+fare+" ) (number of seats available:" +capacity+" )");
                break;
            case 2:
                fare=1500;
                capacity=3;
                System.out.println("you selected BulletTrain (fare: "+fare+" )  (number of seats available:" +capacity+" )");
                break;
            case 3:
                fare=1000;
                capacity=4;
                System.out.println("you selected RajDhani Express (fare: "+fare+" )  (number of seats available:" +capacity+" )");
                break;
        
            default:
            System.out.println("invalid train choice ");
                break;
        }

        int booked=0,waiting=0;
        do {
            System.out.println("enter no. of seats to be booked ");
            int seats=sc.nextInt();
            for(int i=1;i<=seats;i++){
                if (booked<capacity) {
                    booked++;
                    System.out.println("seat books for passenger "+i);
                }
                else{
                    waiting++;
                    System.out.println("passenger "+i+" in waitinglist ");
                }
            }
            System.out.println("current bookes seats: "+booked+"/"+capacity+" waitinglist: "+waiting);
            if (booked<capacity) {
                System.out.println("you want to continue booking  ");
                String ans=sc.nextLine();
                if (!ans.equals("yes") || !ans.equals("YES") ) {
                    break;
                }
                else{
                    System.out.println("train fully booked ");
                    break;
                }
            }
        } while (true);
        System.out.println("\nFinal Reservation Summary:");
        System.out.println("Total Seats: " + capacity);
        System.out.println("Booked Seats: " + booked);
        System.out.println("Waiting List: " + waiting);
        System.out.println("Fare per Passenger: " + fare);
        System.out.println("Total Collection: " + (booked * fare));
       
       
     }
    public static void main(String[] args) {
        trains();
    }

}
