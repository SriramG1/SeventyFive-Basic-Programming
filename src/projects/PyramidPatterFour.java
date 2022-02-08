package projects;

import java.util.Scanner;

public class PyramidPatterFour {
    public static void main(String[] args) {

        //program : 72
        //Pyramid patter four

        Scanner in=new Scanner(System.in);
        System.out.println("Enter your rows : ");
        int rows=in.nextInt();
        for (int i = 1; i <=rows; i++) {
            for (int j = i*2; j <rows+rows; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(j+" ");
            }
            for (int j = i-1; j >=1; j--) {
                System.out.print(j+ " ");
            }

            System.out.println();
        }
    }
}
