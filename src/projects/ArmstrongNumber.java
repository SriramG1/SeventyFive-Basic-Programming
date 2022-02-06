package projects;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {

        //Program to check armstrong number:

        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number :");
        int n = in.nextInt();
        int temp = 0;
        int original = n;
        int count = 0;
        //count
        while (original > 0) {
            original /= 10;
            count++;
        }
        original=n;

            while (original > 0)
            {
                int rem = original % 10;
                int a =(int) Math.pow(rem, count);
                temp += a;
                original = original / 10;
            }
            original=n;
            if (temp == original) {
                System.out.println("Your number is Armstrong");
            } else {
                System.out.println("Your number is not a armstrong");
            }
    }
}


