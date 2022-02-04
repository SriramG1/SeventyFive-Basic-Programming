package projects;

import java.util.Scanner;

public class Fourteen {
    public static void main(String[] args) {
        // Write a program to find the area of the cylinder

        Scanner in =new Scanner(System.in);
        System.out.println("Enter the radios of cylinder :");
        float radios =in.nextFloat();
        System.out.println("Enter the height of cylinder :");
        float height =in.nextFloat();
        float areaOfCylinder = (float) ((2*3.14*radios*height)+(2*3.14*radios*radios));
        System.out.println(areaOfCylinder);
    }
}
