package projects;

import java.util.Scanner;

public class TwentyFour {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter your y value :");
        int y=in.nextInt();
        if(y==10) {
            int z = (++y * (y++ + 5));
            System.out.println(z);
        }
    }
}
