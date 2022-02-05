package projects;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.println("Enter Your number : ");
        int num= in.nextInt();
        System.out.println("Your value is : "+num);
        int rem,reverse=0;
        while(num>0) //123 12 1 condition true
        {
            rem=num%10; //3 2 1
            reverse=(reverse*10)+rem; //3 32 321
            num=num/10; //12 1 0
        }
        System.out.println("Your reverse value is : "+reverse);
    }
}
