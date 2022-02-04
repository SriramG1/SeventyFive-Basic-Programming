package projects;

import java.util.Scanner;

public class Sixteen {
    public static void main(String[] args) {
        //Given the radius of two concentric circle, find the area of the space between the circles
        Scanner in=new Scanner(System.in);
        System.out.println("Enter radius of small circle :");
        float radiosOfS_C = in.nextFloat();
        System.out.println("Enter radius of big circle :");
        float radiosOfB_C = in.nextFloat();
        float areaOfS_c= (float) (3.142*radiosOfS_C*radiosOfS_C);
        float areaOfB_c= (float) (3.142*radiosOfB_C*radiosOfB_C);
        float areaOfSpace = areaOfB_c-areaOfS_c;
        System.out.println("Area of big circle is :"+areaOfB_c);
        System.out.println("Area of big circle is :"+areaOfS_c);
        System.out.println("Area of the space between the circles :"+areaOfSpace);
    }
}
