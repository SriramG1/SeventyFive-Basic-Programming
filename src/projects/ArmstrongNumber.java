package projects;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {

        //Program to check armstrong number:

        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number :");
        int n = in.nextInt();
        int temp = 0;
        int temp2 = n;
        int temp3 = n;
        int count = 0;
        //count
        while (temp3 > 0) {
            int rem1 = temp2 % 10;
            count++;
            temp3 /= 10;
        }
        if (count >= 4) {
            while (n > 0)
            {
                int rem = n % 10;
                int a = (int) Math.pow(rem, count);
                temp += a;
                n = n / 10;

            }
            if (temp == temp2) {
                System.out.println("Your number is Armstrong");
            } else {
                System.out.println("Your number is not a armstrong");
            }
        }
        else {
            while (n > 0) // 1 6 3 4
            {
                int rem = n % 10; // 4
                int a = (int) Math.pow(rem, 3);
                temp += a;
                n = n / 10;
            }
            if (temp == temp2) {
                System.out.println("Your number is Armstrong");
            } else {
                System.out.println("Your number is not a armstrong");
            }
        }
    }
}

