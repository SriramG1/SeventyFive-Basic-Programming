package projects;

import java.util.Scanner;

public class MultiplyMatricesFunction {
   static void multiply(int [][]mat1,int [][]mat2){

       int [][]mul=new int[mat2.length][mat1.length];
       for(int i=0;i<mat1.length;i++)
       {
           for(int j=0;j< mat2.length;j++)
           {
               for(int k=0;k<mul.length;k++)
               {
                   mul[i][j]+=mat1[i][k]*mat2[k][j];
               }
           }
       }
       for (int i=0;i< mul.length;i++)
       {
           for(int j=0;j< mul.length;j++)
           {
               System.out.print(mul[i][j]+" ");
           }
           System.out.println();
       }
   }

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter Row of your matrix :");
        int row= in.nextInt();
        System.out.println("Enter Column of your matrix :");
        int column=in.nextInt();
        int [][]matrix1=new int[row][column];
        int [][]matrix2=new int[row][column];
        System.out.println("Enter Matrix one :");
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<column;j++)
            {
                System.out.print("["+i+"] ["+j+"] :");
                matrix1[i][j]=in.nextInt();
            }
        }
        System.out.println("Enter Matrix two :");
        for(int i=0;i<row;i++)
        {
            for (int j=0;j<column;j++)
            {
                System.out.print("["+i+"] ["+j+"] :");
                matrix2[i][j]=in.nextInt();
            }
        }
        multiply(matrix1,matrix2);
    }
}
