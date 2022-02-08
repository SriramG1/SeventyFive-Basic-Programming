package projects;

import java.util.Scanner;

public class Fifteen {
    public static void main(String[] args) {
        //program : 15
        //Write a program to evaluate the polynomial equation:

        Scanner in=new Scanner(System.in);
        System.out.println("Enter the value of a , b and c : ");
        double a=in.nextFloat();
        double b=in.nextFloat();
        double c=in.nextFloat();
        double x=b*b-4*a*c;
        if (x>0) {
            double root1 =  (-b + Math.pow(x,0.5)) / (2 * a);
            double root2 =  (-b - Math.pow(x,0.5)) / (2 * a);
            System.out.println("Roots are " + root1 + " and " + root2);
        }
        else if(x==0){
            double root =-b/(2.0*a);
            System.out.println("Root is " + root);
        }
        else{
            System.out.println("Roots are imaginary");
        }
    }
}
