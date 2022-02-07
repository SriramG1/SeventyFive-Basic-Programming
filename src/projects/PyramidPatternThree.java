package projects;

import java.util.Scanner;

public class PyramidPatternThree {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            System.out.println("Enter Rows :");
            int rows = in.nextInt();
            for (int i = 1; i <= rows; i++) {
                for (int j =i; j <rows; j++) {
                    System.out.print(" ");
                }
                for (int k = 1; k <= i; k++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
    }
