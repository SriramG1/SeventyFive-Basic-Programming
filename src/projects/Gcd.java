package projects;

import java.util.Scanner;

public class Gcd {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.println("Enter two positive integers :");
        int num1=in.nextInt();
        int num2=in.nextInt();
        int gcd=0;
        for(int i=1; i<=num1 && i<=num2; ++i)
        {
            if(num1%i==0 && num2%i==0)
            {
                 gcd=i;
            }
        }
        System.out.println("GCD of "+num1+" & "+num2+" numbers is :"+gcd);
    }
}
