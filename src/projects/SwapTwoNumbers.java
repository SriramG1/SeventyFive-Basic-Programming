package projects;

import java.util.Scanner;

public class SwapTwoNumbers {
    public static void main(String[] args) {

        //Program to swap two numbers

        Scanner in=new Scanner(System.in);
        System.out.println("Enter Two Numbers : ");
        int input1=in.nextInt();
        int input2=in.nextInt();
        System.out.println("Before Swapping : A = " + input1 + " and  B = " + input2);
        int temp;
        temp=input1;
        input1=input2;
        input2=temp;
        System.out.println("After Swapping : A = " + input1 + " and  B = " + input2);

        //Without using temporary variable

        System.out.println("Enter Two Numbers : ");
        int input3=in.nextInt();
        int input4=in.nextInt();
        System.out.println("Before Swapping : A = " + input3 + " and  B = " + input4);
        input3+=input4;
        input4=input3-input4;
        input3-=input4;
        System.out.println("Before Swapping : A = " + input3 + " and  B = " + input4);
    }
}
