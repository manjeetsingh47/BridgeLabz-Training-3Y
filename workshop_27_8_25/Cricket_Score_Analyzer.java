package workshop_27_8_25;

import java.util.Scanner;

public class Cricket_Score_Analyzer {
    static Scanner sc=new Scanner(System.in);


    static void scores(int[] arr){
        System.out.println("enter scores of batsman: ");
        for(int i=0;i<arr.length;i++){
            System.out.print("enter score of batsman "+(i+1)+": ");
            arr[i]=sc.nextInt();
        }
    }


    static void result(int[] arr){
        int ls=Integer.MAX_VALUE;
        int hs=Integer.MIN_VALUE;
        int sum=0;

        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            if (arr[i]>hs) {
                hs=arr[i];
            }
            if (arr[i]<ls) {
                ls=arr[i];
            }
            if (arr[i]>=100) {
                System.out.print("batsman "+(i+1)+" scored century");
                System.out.println();
            }
        }
        int avg=(sum)/arr.length;

        System.out.println("highest score: "+hs);
        System.out.println("lowest score: "+ls);
        System.out.println("Average score: "+avg);
    }


    public static void main(String[] args) {
        System.out.println("enter no. of  batsman: ");
        int n=sc.nextInt();
        int[] ScoreCard=new int[n];
        scores(ScoreCard);
        result(ScoreCard);

    }
}
