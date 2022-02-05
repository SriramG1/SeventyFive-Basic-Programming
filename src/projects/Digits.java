package projects;

import java.util.Scanner;

public class Digits {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Your number : ");
        int number=in.nextInt();
        int count=0;
        while(number!=0)
        {
            number=number/10;
                count++;
            }
        System.out.println("Numbetr of your digits is : "+count);
        }
    }

