package projects;

import java.util.Scanner;

public class PyramidPatternFive {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter rows :");
        int rows=in.nextInt();

        for (int i = rows; i >=1; i--) {
            for (int j = i; j >1; j--) {
                System.out.print(" ");
            }
            for (int j=i;j<=rows;j++) {
                System.out.print(j);
            }
            for (int j = rows-1; j >=i; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
