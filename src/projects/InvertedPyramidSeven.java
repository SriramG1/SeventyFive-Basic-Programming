package projects;

import java.util.Scanner;
public class InvertedPyramidSeven {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Row Number :");
        int rows = in.nextInt();
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = i; j <= rows; j++) {
                System.out.print(j+ " ");
            }
            System.out.println();
        }
    }
}
