package projects;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the limit of your table :");
        int limit= in.nextInt();
        System.out.println("Which table you want :");
        int num= in.nextInt();
        for(int i=1;i<limit;i++)
        {
            int result=i*num;
            System.out.println(i + " x "+num+" = "+result);
        }
    }
}
