package projects;

import java.util.Scanner;

public class CharacterLoop {
    public static void main(String[] args) {

        //Program to display character from A to Z Using loop

        Scanner in=new Scanner(System.in);
        System.out.println("Press 1 for print A to Z :");
        int on=in.nextInt();
        if(on==1)
        {
        for(int i=65;i<=90;i++)
        {
            System.out.print((char)i+" ");
        }
        }
    }
}
