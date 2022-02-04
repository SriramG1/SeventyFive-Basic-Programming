package projects;

import java.util.Scanner;

public class Nineteen {
    public static void main(String[] args) {
        //Bitwise Operators :
        //Bitwise AND (&)
        // 0 0 1 1
        // 0 1 0 1
        //----------
        // 0 0 0 1
        System.out.println("Bitwise AND (&) ");
        Scanner in=new Scanner(System.in);
        System.out.println("Enter your value a and b : ");
        int input1=in.nextInt();
        int input2=in.nextInt();
        int result=(input1&input2);
        System.out.println("Answer for " +input1+ " & " +input2+ " = " +result);

        //Bitwise OR (|)
        // 0 0 1 1
        // 0 1 0 1
        //----------
        // 0 1 1 1
        System.out.println("Bitwise OR (|) ");
        int result1=(input1|input2);
        System.out.println("Answer for " +input1+ " | " +input2+ " = " +result1);

        //Bitwise XOR (^)
        // 0 0 1 1
        // 0 1 0 1
        //----------
        // 0 1 1 0
        System.out.println("Bitwise XOR (^)");
        int result2=(input1^input2);
        System.out.println("Answer for " +input1+ " | " +input2+ " = " +result2);

        //Bitwise Compliment (~)
        // 0 0 1 1
        //----------
        // 1 1 0  0
        System.out.println("Bitwise Compliment (~)");
        int result3=(~input1);
        System.out.println("Answer for ~"+input1+" = "+result3);
    }
}
