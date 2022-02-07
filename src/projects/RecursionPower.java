package projects;

import java.util.Scanner;

public class RecursionPower {
    public static int rec(int base, int power){
        if(power==0) {
            return 1;
        }
        else {
            return base * rec(base, power - 1);
        }
    }

    public static void main(String[] args) {
     Scanner in =new Scanner(System.in);
        System.out.println("Enter Your Base value : ");
        int base=in.nextInt();
        System.out.println("Enter Your Power value : ");
        int power=in.nextInt();
        int result = rec(base,power);
        System.out.println("value of "+base+ " ^ "+power+" : "+result);
    }
}
