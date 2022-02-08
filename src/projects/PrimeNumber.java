package projects;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        //program : 49
        //program to check whether a number is prime or not:

        Scanner in=new Scanner(System.in);
        System.out.println("Enter Your number : ");
        int number= in.nextInt();
        int count=0;
        for(int i=1;i<=number;i++)
        {
            if(number%i==0) {
                count++;
            }
        }
        if(count==2)
        {
            System.out.println(number+" is prime number");
        }
        else
            System.out.println(number+" is not a prime number");
    }
}
