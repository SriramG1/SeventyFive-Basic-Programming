package projects;

import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter Your value : ");
        int input=in.nextInt();
        if(input%2==0){
            System.out.println(input+" is Even");
        }
        else{
            System.out.println(input+" is Odd");
        }
    }
}
