package projects;

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter Your Three Numbers : ");
        int num1=in.nextInt();
        int num2=in.nextInt();
        int num3=in.nextInt();
        if ((num1 > num2) && (num1 > num3)){
            System.out.println("Largest value is "+ num1);
        }
        else if(num2>num3) {
            System.out.println("Largest value is " + num2);
        }
        else{
            System.out.println("Largest value is "+ num3);
        }
    }
}
