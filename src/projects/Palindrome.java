package projects;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        //Program to find palindrome:
        //1 2 3 4 5 6 7 8 9 11 22 33 44 55 66......

        Scanner in=new Scanner(System.in);
        System.out.println("Enter Your Number : ");
        int n= in.nextInt();
        int temp=n;
        int reverse=0;
        while(n>0) // 1 2 3
        {
          int rem=n%10; // 3 2 1
           reverse=(reverse*10)+rem; // 3 32 321
          n=n/10; // 12 1
        }
        if(reverse==temp)
        {
            System.out.println(temp+" is palindrome");
        }
        else
        {
            System.out.println(temp+" is not a palindrome");
        }
    }
}
