package projects;

import java.util.Scanner;

public class BinaryToDecimal {
    public static void bin2dec(int binary){
        int decimal=0,power=0;
        while(binary!=0){
            int rem=binary%10;
            decimal += rem *Math.pow(2,power);
            binary=binary/10;
            power++;
        }
        System.out.println("Your decimal value is "+decimal);
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter your binary number : ");
        int binary=in.nextInt();
        bin2dec(binary);
    }
}
