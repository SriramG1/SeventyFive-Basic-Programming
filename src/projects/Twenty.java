package projects;

import java.util.Scanner;

public class Twenty {
    public static void main(String[] args) {
        //Write a program to find the difference between prefix and postfix operators;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the value of a :");
        int a=in.nextInt();
        int b=a++;

        System.out.println("a++ : "+b);

        System.out.println("Enter the value of a :");
        int d=in.nextInt();
        int c=++d;
        System.out.println("++a : "+d);


    }
}
