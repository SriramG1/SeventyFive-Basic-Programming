package projects;

import java.util.Scanner;

public class PrimeNumbersInterval {

    static void prime() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Your Starting point :");
        int start = in.nextInt();
        System.out.println("Enter Your Ending point :");
        int end = in.nextInt();

        for (int i = start; i <= end; i++) {
            int half = i / 2;
            int count = 0;

            if (i == 0 || i == 1) {
                System.out.println(" ");
            } else {
                for (int j = 2; j < half; j++) {
                    if (i % j == 0) {
                        count = 1;
                        break;
                    }
                }
                if (count == 0) {
                    System.out.println(i + " is a prime number");
                }
            }
        }
    }
        public static void main (String[]args){
        prime();
        }
}

