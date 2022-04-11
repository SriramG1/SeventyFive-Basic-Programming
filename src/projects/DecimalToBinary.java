package projects;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class DecimalToBinary {
    public static void binary2Decimal(int n){
        ArrayList<Integer> binaryNum= new ArrayList<>();
        while(n>0){
            binaryNum.add( n % 2);
            n = n / 2;
        }
        Collections.reverse(binaryNum);
        for(int k:binaryNum){
            System.out.print(k+" ");
        }
    }
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.println("Enter your decimal number : ");
        int n= in.nextInt();
        System.out.println("Your binary value is : ");
        binary2Decimal(n);
    }
}

