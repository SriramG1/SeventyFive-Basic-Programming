package projects;

import java.util.Scanner;

public class Seventeen {
    public static void main(String[] args) {

        //Write a program with Unary operators

        Scanner in=new Scanner(System.in);
        System.out.println("Enter your value : ");
        int a= in.nextInt();
        System.out.println("Unary plus : ");
        System.out.println(+a);
        System.out.println("Unary minus :");
        System.out.println(-a);
        System.out.print("Post increment : ");
        System.out.println(a++);
        System.out.print("Pre increment : ");
        System.out.println(++a);
        System.out.print("Post decrement : ");
        System.out.println(a--);
        System.out.print("pre decrement : ");
        System.out.println(--a);
        a+=5;
        System.out.println(a);

    }
}
