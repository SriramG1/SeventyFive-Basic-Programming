package projects;

import java.util.Scanner;

public class Thirteen{
    public static void main(String[] args) {
        //Write a program to find the area of the rectangle
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the length of rectangle : ");
        int l=in.nextInt();
        System.out.println("Enter the breath of rectangle : ");
        int b=in.nextInt();
        int areaOfRect=(l*b);
        System.out.println("Area of triangle is : "+areaOfRect);
    }
}
