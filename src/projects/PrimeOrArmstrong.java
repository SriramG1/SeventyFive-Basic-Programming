package projects;

import java.util.Scanner;

public class PrimeOrArmstrong {
    static void primeOrArmstrong() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Your Number :");
        int number = in.nextInt();
        int half = number / 2;
        int count = 0;
        if (number == 0 || number == 1) {
            System.out.println(number + " is not a prime number");
        } else {
            for (int i = 2; i < half; i++) {
                if (number % i == 0) {
                    System.out.println(number + " is not a prime number");
                    count = 1;
                    break;
                }
            }
            if (count == 0) {
                System.out.println(number + " is a prime number");
            }
        }
        int digits = 0;
        int rem ;
        int original = number;
        int armstrong = 0;
        while (original > 0) {
            original = original / 10;
            digits++;
        }
        original = number;
        while (original > 0) {
            rem = original % 10;
            armstrong += Math.pow(rem, digits);
            original /= 10;
        }
        if (armstrong == number) {
            System.out.println(number+" is armstrong");
        } else {
            System.out.println(number+" is not a armstrong");
        }
    }

    public static void main(String[] args) {
        primeOrArmstrong();
    }
}
