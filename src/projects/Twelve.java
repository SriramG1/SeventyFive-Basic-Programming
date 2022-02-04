package projects;

import java.util.Scanner;

public class Twelve {
    public static void main(String[] args) {
        //Write a program to find the area of the square
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the side of square : ");
        int a=in.nextInt();
        int area=a*a;
        System.out.println("Area of Square is : "+area);
    }
}
