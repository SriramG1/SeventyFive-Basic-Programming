package projects;

import java.util.Scanner;

public class Conversion {
    public static void main(String[] args) {
        //Convert km to miles:

        Scanner in=new Scanner(System.in);
        System.out.println("Enter Your kilometer : ");
        float kilometer= in.nextFloat();
        float result=kilometer*0.62137f;
        System.out.println(result+" Miles");

        //Convert centigrade to fahrenheit :
        System.out.println("Enter Your Centigrade :");
        float centigrade=in.nextFloat();
        float fahrenheit = (centigrade*1.8f)+32;
        System.out.println(fahrenheit+" F");

        //Convert Squarefeet to Acres:
        System.out.println("Enter your SquareFeet :");
        float sqft= in.nextFloat();
        float acres = sqft/43560;
        System.out.println(acres+"Acres");
    }
}
