package projects;

import java.util.Scanner;


public class QuadraticEquation {
    static void quadratic(double a,double b,double c){
        double x=b*b-(4*a*c);
        if(x==0)
        {
            System.out.println("Root is :"+-b/(2*a));
        }
        else if(x>0)
        {
            double root1=((-b+Math.pow(x,0.5))/(2*a));
            double root2=((-b-Math.pow(x,0.5))/(2*a));
            System.out.println("Root one :"+root1);
            System.out.println("Root two :"+root2);
        }
        else
        {
            System.out.println("Roots are imaginary");
        }
    }

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter value of a :");
        int a= in.nextInt();
        System.out.println("Enter value of b :");
        int b= in.nextInt();
        System.out.println("Enter value of c :");
        int c= in.nextInt();
        quadratic(a,b,c);
    }
}
