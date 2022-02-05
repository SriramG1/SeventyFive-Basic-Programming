package projects;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("1.Addition");
        System.out.println("2.Subtraction");
        System.out.println("3.Multiplication");
        System.out.println("4.Division");
        System.out.println("5.Remainder");
        System.out.println("Enter your choice :");
        int choice= in.nextInt();
        System.out.println("Enter two values :");
        int num1= in.nextInt();
        int num2= in.nextInt();
        switch (choice)
        {
            case 1:
                int result=num1+num2;
                System.out.println("Your addition value is : "+result);
                break;
            case 2:
                 result=num1-num2;
                System.out.println("Your subtraction value is "+result);
                break;
            case 3:
                 result=num1*num2;
                System.out.println("Your multiplication value is "+result);
                break;
            case 4:
                result=num1/num2;
                System.out.println("Your division value is "+result);
                break;
            case 5:
                result=num1%num2;
                System.out.println("Your remainder value is "+result);
                break;
            default:
                System.out.println("Enter valid option !");
        }
    }
}
