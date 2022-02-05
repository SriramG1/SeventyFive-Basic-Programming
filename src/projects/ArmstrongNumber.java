package projects;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {

        //Program to check armstrong number:

        Scanner in=new Scanner(System.in);
        System.out.println("Enter the number :");
        int n= in.nextInt();
        int temp=0;
        int temp2=n;
        while(n>0) // 1 6 3 4
        {
            int rem=n%10; // 4
            int a= (int) Math.pow(rem,3);
            temp+=a;
            n=n/10;
        }
        if(temp==temp2)
        {
            System.out.println("Your number is Armstrong");
        }
        else
        {
            System.out.println("Your number is not a armstrong");
        }
    }
}
