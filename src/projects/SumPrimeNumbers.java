package projects;

import java.util.Scanner;

public class SumPrimeNumbers {

    static boolean checkPrimeNumber(int n)
    {
        boolean Prime=true;

        for(int j=2;j<=n/2;++j)
        {
            if(n%j==0)
            {
                Prime = false;
                break;
            }

        }

        return Prime;

    }
    public static void main(String[] args) {
        System.out.println("Enter the number :");
        Scanner sc= new Scanner (System.in);
        int number = sc.nextInt();
        boolean flag =false;

        for(int i=2;i<=number/2;++i)
        {
            if(checkPrimeNumber(i)) {
                if(checkPrimeNumber(number-i)) {
                    System.out.println(number+" = "+i+" + "+(number-i));
                    flag = true;
                }}
        }
        if(!flag)
        {
            System.out.println(number+"Number cannot be as prime number");
        }
    }

}