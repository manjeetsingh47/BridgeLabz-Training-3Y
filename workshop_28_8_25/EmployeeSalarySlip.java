package workshop_28_8_25;

import java.util.Scanner;

public class EmployeeSalarySlip {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {

        String[] names={"Ayan","Akshit","Vishal","Rahul","Deepak"};
        double[] salary={40000,70000,85000,70000,60000};
        for(int i=0;i<names.length;i++){
            double HRA=0,DA=0,NetSalary=0;
            HRA=salary[i]*0.2;
            DA=salary[i]*0.1;
            NetSalary=(salary[i]+HRA+DA);
            if (NetSalary>50000) {
                NetSalary=NetSalary-(NetSalary*0.1);
            }
            System.out.println("Salary slip of "+names[i]+": ");
            System.out.println("HRA: "+HRA+" \nDA: "+DA+"\nNetSalary: "+NetSalary);
            System.out.println();
        }

    }

}
       