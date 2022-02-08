package projects;

import java.util.Scanner;

public class OctalToDecimal {
    public static void main(String[] args) {

        //program : 61
        //Program to convert octal number to decimal :

        Scanner in=new Scanner(System.in);
        System.out.println("Enter Your Octal :");
        int number=in.nextInt();
        int rem;
        int decimal=0;
        int n=0;
        while(number>0) // 121
        {
           rem= number % 10; // 1 2
           decimal+=rem*Math.pow(8,n); //0+3*8^0 3+2*8^1
            number=number/10; //12
            n++;
        }
        System.out.println("Your decimal number is : "+decimal);
    }
}
