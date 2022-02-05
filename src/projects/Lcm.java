package projects;

import java.util.Scanner;

public class Lcm {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter two integers :");
        int num1=in.nextInt();
        int num2=in.nextInt();
        int max = Math.max(num1, num2);
        while(true) {
            if(max%num1==0 && max%num2==0) {
                System.out.println(" LCM of two numbers is :"+max);
                break;
            }
            ++max;
        }
    }
}
