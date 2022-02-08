package projects;

import java.util.Scanner;

public class OctalToBinary {
    static String octalToBinary(String octal) {
        String binary = "";
        int i = 0;
        while (i < octal.length()) {
            char c = octal.charAt(i);
            switch (c) {
                case '0':
                    binary = binary + "000 ";
                    break;
                case '1':
                    binary = binary + "001 ";
                    break;
                case '2':
                    binary = binary + "010 ";
                    break;
                case '3':
                    binary = binary + "011 ";
                    break;
                case '4':
                    binary = binary + "100 ";
                    break;
                case '5':
                    binary = binary + "101 ";
                    break;
                case '6':
                    binary = binary + "110 ";
                    break;
                case '7':
                    binary = binary + "111 ";
                    break;
                default:
                    System.out.println("Enter Valid Numbers !!!");
                    break;
            }
            i++;
        }
        return binary;
    }

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter Your Octal value :");
        String octal=in.next();
        String result=octalToBinary(octal);
        System.out.println(result);
    }
}
