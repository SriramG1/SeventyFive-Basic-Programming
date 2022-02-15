package projects;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        //program : 49
        //program to check whether a number is prime or not:

        Scanner in = new Scanner(System.in);
        System.out.println("Enter Your number : ");
        int number = in.nextInt();
        int count = 0;
        if (number == 0 || number == 1) {
            System.out.println(number + " is not a prime number");
        }
        else {
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    count++;
                    break;
                }
            }
            if (count == 0) {
                System.out.println(number + " is prime number");
            } else
                System.out.println(number + " is not a prime number");
        }
    }
}
