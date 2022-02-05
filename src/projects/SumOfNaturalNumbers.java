package projects;

import java.util.Scanner;

public class SumOfNaturalNumbers {
    public static void main(String[] args) {
        //Program to Calculate sum of N natural numbers
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Your limit :");
        int limit= in.nextInt();
        int result=(limit*(limit+1))/2;
        System.out.println(result);
    }
}
