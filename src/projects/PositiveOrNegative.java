package projects;

import java.util.Scanner;

public class PositiveOrNegative {
    public static void main(String[] args) {
        //program to check whether  a number is positive or negative

        Scanner in=new Scanner(System.in);
        System.out.println("Enter your value :");
        int number= in.nextInt();
        if(number>0)
        {
            System.out.println("Your number is positive");
        }
        else
        {
            System.out.println("Your value is negative");
        }
    }
}
