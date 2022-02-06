package projects;

import java.util.Scanner;

public class RecursionFactorial {
    static int fact(int n){
        if(n==0)
            return 1;
        return n*fact(n-1);
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter Your number :");
        int number=in.nextInt();
        System.out.println("Factorial of "+number+" is :"+fact(number));
    }
}
