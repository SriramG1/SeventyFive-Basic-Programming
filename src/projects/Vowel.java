package projects;

import java.util.Scanner;

public class Vowel {
    public static void main(String[] args) {
        //Write a program to check whether a character is vowels or a constants:
        Scanner in= new Scanner(System.in);
        System.out.println("Enter Your character :");
        char character=in.next().charAt(0);
        switch (character){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
                System.out.println(character+" is vowel ");
                break;
            default:
                System.out.println("Not a vowel");

        }

    }
}
