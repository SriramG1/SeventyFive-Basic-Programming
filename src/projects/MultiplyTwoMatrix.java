package projects;

import java.util.Scanner;

public class MultiplyTwoMatrix {
    public static void main(String[] args) {
        //program : 66
        //Multiply  two matrices :

        Scanner in=new Scanner(System.in);
        System.out.println("Enter Your rows of your matrix: ");
        int rows=in.nextInt();
        System.out.println("Enter column of your matrix : ");
        int column=in.nextInt();
        int [][]matrix1=new int[rows][column];
        int [][]matrix2=new int[rows][column];
        int [][]multiply=new int[rows][column];
        System.out.println("Enter matrix one elements :");
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<column;j++)
            {
                System.out.print(" ["+i+"] ["+j+"]  :" );
                matrix1[i][j]=in.nextInt();
            }
        }
        System.out.println("Matrix one :");
        for(int i=0;i<rows;i++)
        {
            for (int j=0;j<column;j++)
            {
                System.out.print(matrix1[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Enter matrix two elements :");
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<column;j++)
            {
                System.out.print(" ["+i+"] ["+j+"]  :" );
                matrix2[i][j]=in.nextInt();
            }
        }
        System.out.println("   *    ");

        System.out.println("Matrix two :");

        for(int i=0;i<rows;i++)
        {
            for (int j=0;j<column;j++)
            {
                System.out.print(matrix2[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Matrix one * Matrix two :");
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<column;j++) {
                for (int k = 0; k < rows; k++) {
                    multiply[i][j] =multiply[i][j]+matrix1[i][k]*matrix2[k][j];
                }
                System.out.print(multiply[i][j]+" ");
            }
            System.out.println();
        }
    }
}
