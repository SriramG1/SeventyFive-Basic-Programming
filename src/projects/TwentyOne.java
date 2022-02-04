package projects;

import java.util.Scanner;

public class TwentyOne {
    public static void main(String[] args) {
       // System.out.println("i :");
        Scanner in=new Scanner(System.in);
       /* System.out.println("Enter your value :");
        int a=in.nextInt();
        System.out.println("Enter your value :");
        int b=in.nextInt();
       // System.out.println(++a-b-);
        //That makes error illegal start of expression :*/

        System.out.println("ii :");
        int a1=11;
        int b1=5;
        System.out.println(a1%b1++); //b1 value is increase in address 6
        System.out.println(b1);
        System.out.println();

        System.out.println("iii :");
        System.out.println("Enter your a2 value :");
        int a2=in.nextInt();
        System.out.println("Enter your b2 value :");
        int b2=in.nextInt();
        System.out.println(a2*=b2+5); //(5+b2) * a2

        System.out.println("iv :");
        int x=69>>>2;
        System.out.println(x);

    }
}
