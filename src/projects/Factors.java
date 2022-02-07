package projects;

import java.util.Scanner;

public class Factors {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.println("Enter your number :");
        int number =in.nextInt();
        System.out.println("Factors of "+ number +" is  :");
        for (int i=1;i<=number;i++)
        {
            if (number%i==0)
            {
                System.out.print(i+" ");
            }
        }
    }
}
