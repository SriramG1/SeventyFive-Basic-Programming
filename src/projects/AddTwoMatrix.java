package projects;

import java.util.Scanner;

public class AddTwoMatrix {
    public static void main(String[] args) {
        //program : 65
        //Add two matrices :
        Scanner in=new Scanner(System.in);
        System.out.println("Enter Rows :");
        int rows=in.nextInt();
        System.out.println("Enter Column :");
        int column=in.nextInt();
        int [][]matrix1 = new int[rows][column];
        int [][]matrix2 = new int[rows][column];
        int [][]add = new int[rows][column];
        System.out.println("Enter matrix One elements :");
        for(int i=0;i<rows;i++)
        {
            for (int j=0;j<column;j++)
            {
                System.out.print("["+i+"] ["+j+"] :");
                matrix1[i][j]=in.nextInt();
            }
        }
        System.out.println("Matrix one :");
        for (int i=0;i<rows;i++)
        {
            for(int j=0;j<column;j++)
            {
                System.out.print(matrix1[i][j]);
            }
            System.out.println();
        }
        System.out.println("Enter matrix two elements :");
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<column;j++)
            {
                System.out.print("["+i+"] ["+j+"] :");
                matrix2[i][j]= in.nextInt();
            }
        }
        System.out.println("Matrix two :");
        for(int i=0;i<rows;i++)
        {
            for (int j=0;j<column;j++)
            {
                System.out.print(matrix2[i][j]);
            }
            System.out.println();
        }

        for (int i=0;i<rows;i++)
        {
            for (int j=0;j<column;j++)
            {
                add[i][j]=matrix1[i][j]+matrix1[i][j];
            }
        }
        System.out.println("Matrix 1 + Matrix 2 :");
        for(int i=0;i<rows;i++)
        {
            for (int j=0;j<column;j++)
            {
                System.out.print(add[i][j]+" ");
            }
            System.out.println();
        }
    }
}
