package projects;

import java.util.Scanner;

public class PyramidPatternOne {
    public static void main(String[] args) {
        Scanner in = new  Scanner(System.in);
        System.out.println("Enter Rows :");
        int rows = in.nextInt();
        for (int i = 1; i <= rows; i++) {
            for (int j = i; j < rows; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=i; j++) {
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
