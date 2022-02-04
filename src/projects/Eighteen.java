package projects;

import java.util.Scanner;

public class Eighteen {
    public static void main(String[] args) {
        //Ternary operators :
        Scanner in=new Scanner(System.in);
        System.out.println("Enter your value :");
        int a=in.nextInt();
        String x=(a>0)?"Positive":"Negative";
        System.out.println(x);
    }
}
