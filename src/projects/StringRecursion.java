package projects;

import java.util.Scanner;

public class StringRecursion {
    static String recursion(String string){
        if(string.isEmpty())
        {
            return string;
        }
        else{
            return recursion(string.substring(1))+string.charAt(0);
        }
    }

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String str= in.next();
        String result=recursion(str);
        System.out.println(result);
    }
}
