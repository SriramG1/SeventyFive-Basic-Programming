package projects;

import java.util.Scanner;

public class FibonacciSequence {
    public static void main(String[] args) {
        //Program for Fibonacci sequence
        // 0 1 1 2 3 5 8 13 21.....
        Scanner in =new Scanner(System.in);
        System.out.println("Enter the Limit :");
        int n=in.nextInt();
        int a=-1,b=1,c;
        for(int i=1;i<=n;i++)
        {
            c=a+b;
            System.out.println(c);
            a=b;
            b=c;
        }
    }
}
