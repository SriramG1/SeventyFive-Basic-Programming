package projects;

import java.util.Scanner;

public class InvertedPyramidSeven {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Your Rows :");
        int number = in.nextInt();
        for (int i = number; i >= 1; i--) {
            for (int j = number; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
