package projects;

import java.util.Scanner;

public class BinaryToOctal {
    static void binaryToOctalConvertor(long binary){
        int rem;
        int decimal=0;
        int power=0;
        String octal="";
        char[] octalChar={'0','1','2','3','4','5','6','7'};
        while(binary>0) //100100
        {
            decimal= (int)(decimal+ (Math.pow(2,power++)*(binary%10)));
            binary=binary/10; //10010
        }
        while(decimal>0)
        {
            rem=decimal%8;
           octal=octalChar[rem]+octal;
           decimal/=8;
        }
        System.out.println("Your octal value is :"+octal);
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter binary of octal value :");
        long binary=in.nextLong();
        binaryToOctalConvertor(binary);
    }
}
