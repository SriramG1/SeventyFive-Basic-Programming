package projects;

import java.util.Scanner;

public class TransposeMatrix {
    public static void main(String[] args) {
        //program : 67
        //Transpose of a matrix

        Scanner in=new Scanner(System.in);
        System.out.println("Enter Your matrix rows : ");
        int rows =in.nextInt();
        System.out.println("Enter Your matrix column");
        int column = in.nextInt();
        System.out.println("Enter Your matrix : ");
        int [][]matrix=new int[rows][column];
        int [][]transpose=new int[rows][column];
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<column;j++)
            {
                System.out.print("["+i+"] ["+j+"] :");
                matrix[i][j]= in.nextInt();
            }
        }
        System.out.println("Your Matrix is :");
        for(int i=0;i<rows;i++)
        {
            for (int j=0;j<column;j++)
            {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        for(int i=0;i<rows;i++)
        {
            for (int j=0;j<column;j++)
            {
                transpose[i][j]=matrix[j][i];
            }
        }
        System.out.println("Transpose of your matrix is :");
        for(int i=0;i<rows;i++)
        {
            for (int j=0;j<column;j++)
            {
                System.out.print(transpose[i][j]+" ");
            }
            System.out.println();
        }
    }
}
