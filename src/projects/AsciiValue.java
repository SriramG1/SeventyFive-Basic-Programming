package projects;

import java.util.Scanner;

public class AsciiValue {
    public static void main(String[] args) {

        //Write a program to Find a ASCII value of a Character
        //timme complexity-O(1)

        Scanner in=new Scanner(System.in);
        System.out.println("Enter your Character : ");
        char character= in.next().charAt(0);
        System.out.println("ASCII value of " + character + " is --> " + (int)character);
    }
}
