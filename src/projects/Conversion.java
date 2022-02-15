package projects;

import java.util.Scanner;

public class Conversion {
    public static void main(String[] args) {
        kilometerToMeter();
    }
    public static void kilometerToMeter(){
        //Convert meter to kilometer:
        Scanner in= new Scanner(System.in);
        System.out.println("Enter Your meter value :");
        float km=in.nextFloat();
        double meter=km*0.001;
        System.out.println(meter+"km");
    }

    public static void squareFeetToAcres(){
        //Convert SquareFeet to Acres:
        Scanner in= new Scanner(System.in);
        System.out.println("Enter your SquareFeet :");
        float sqft= in.nextFloat();
        float acres = sqft/43560;
        System.out.println(acres+"Acres");
    }

    public static void kilometerToMiles(){
        //Convert km to miles:
        Scanner in=new Scanner(System.in);
        System.out.println("Enter Your kilometer : ");
        float kilometer= in.nextFloat();
        float result=kilometer*0.62137f;
        System.out.println(result+" Miles");
    }
    public static void centigradeToFahrenheit(){
        //Convert centigrade to fahrenheit :
        Scanner in=new Scanner(System.in);
        System.out.println("Enter Your Centigrade :");
        float centigrade=in.nextFloat();
        float fahrenheit = (centigrade*1.8f)+32;
        System.out.println(fahrenheit+" F");
    }
}
