package projects;

import java.util.Scanner;

public class Alphabet {
    public static void main(String[] args) {

        //Program to check whether a character is an Alphabet or not.
        //Time complexity - O(1)
        Scanner in=new Scanner(System.in);
        System.out.println("Enter Your Character : ");
        char n=in.next().charAt(0);
        if(((n >= 97) && (n <= 122))||((n >= 65) && (n <= 90)))
        {
            System.out.println("Your value is alphabet");
        }
        else
        {
            System.out.println("Your value is not alphabet");
        }
    }
}
