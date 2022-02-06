package projects;

import java.util.Scanner;

public class ArmstrongNumber2 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter any Starting and ending :");
        int start=in.nextInt();
        int end=in.nextInt();

        for(int i=start+1;i<=end;i++)
        {
            int count=0;
            int result=0;
            int original=i;
            while(i>0)
            {
                i=i/10;
                count++;
            }
            i=original;
            while(original>0){
                int rem=original%10;
                result+=Math.pow(rem,count);
                original=original/10;
            }
            if(result==i) {
            System.out.println(i);
            }
        }
    }
}

