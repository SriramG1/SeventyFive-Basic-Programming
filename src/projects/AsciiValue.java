package projects;

import java.util.Scanner;

public class AsciiValue {
    public static void main(String[] args) {

        //Write a program to Find a ASCII value of a Character

        Scanner in=new Scanner(System.in);
        System.out.println("Enter your Number : ");
        int c= in.nextInt();
        System.out.println("ASCII value for " + c + " is " + (char)c);
        System.out.println("Enter your Character ");

    }
}
