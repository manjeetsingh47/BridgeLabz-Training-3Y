package workshop_27_8_25;

import java.util.Scanner;

public class ATM {
    static Scanner sc=new Scanner(System.in);

    
    public static void main(String[] args) {
        System.out.print("Enter Your name: ");
        String name=sc.nextLine();

        System.out.print("Enter number of trnsaction: ");
        int n=sc.nextInt();

        int [] arr=new int[n];
        int balance=0;
        System.out.print("enter amount(positive=deposit,negative=withdrawl) ");
        for(int i=0;i<n;i++){
            
            System.out.println();
            System.out.print("enter  transaction "+(i+1)+": ");
            arr[i]=sc.nextInt();
           
            
        }       
        System.out.println();
        System.out.println("transaction report: ");
        for(int i=0;i<n;i++){
            if(arr[i]<0){
                balance+=arr[i];
                System.out.print("amount withdrawn: "+arr[i]+" | "+" balance: "+balance);
                System.out.println();
            }
            else{
                balance+=arr[i];
                System.out.print("amount deposit:    "+arr[i]+" | "+" balance: "+balance);
                System.out.println();
            }
        }
        System.out.println();
        if(balance<0){
            System.out.println("overdraft");
        }   
        else{
            System.out.println("final balance: "+balance);
        }

    }
}

