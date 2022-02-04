package projects;

import java.util.Scanner;

public class TwentyThree {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter your integer :");
        int x=in.nextInt();
        x=x++ *2+3* -x;
        System.out.println(x);
    }
}
