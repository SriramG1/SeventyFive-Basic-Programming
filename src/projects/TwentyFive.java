package projects;

import java.util.Scanner;

public class TwentyFive {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter x value :");
        int x=in.nextInt();
        if(x==5) {
            int x1 = ++x - x++ + -x;
            System.out.println(x1);
        }
    }
}
