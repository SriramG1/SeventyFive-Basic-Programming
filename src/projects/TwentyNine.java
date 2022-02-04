package projects;

import java.util.Scanner;

public class TwentyNine {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter Your Dividend :");
        int Dividend=in.nextInt();
        System.out.println("Enter the divisor: ");
        int divisor=in.nextInt();

        int quotient=Dividend/divisor;
        int remainder= (Dividend%divisor);
        System.out.println("Your Remainder value is : "+remainder);
        System.out.println("Your Quotient value is : "+quotient);
    }
}
