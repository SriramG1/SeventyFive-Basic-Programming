package projects;

import java.util.Scanner;

public class RecursionGcd {
    static int gcd(int num1, int num2){
        if(num1==0)
            return num2;
        if(num2==0)
            return num1;
        if(num1==num2)
            return num1;
        if(num1>num2)
        return gcd(num1-num2,num2);
        return gcd(num1,num2-num1);
    }
    public static void main(String[] args) {
       Scanner in=new Scanner(System.in);
        System.out.println("Enter Two numbers :");
        int num1= in.nextInt();
        int num2= in.nextInt();
        System.out.println(gcd(num1,num2));
    }
}
