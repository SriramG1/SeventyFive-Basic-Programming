package projects;

import java.util.Scanner;

public class DecimalToOctal {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int number= in.nextInt();
        int rem;
        String octal="";
        char octalChar[]={'0','1','2','3','4','5','6','7'};
        while (number>0)
        {
            rem = number % 8;
            octal = octalChar[rem]+octal;
            number=number/8;
        }
        System.out.println(octal);
    }
}
