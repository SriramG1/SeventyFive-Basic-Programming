package projects;

import java.util.Scanner;

public class CalculatorTwo {
    public static void main(String[] args) {
        System.out.println("Valid Operations : + , - , * , / , % ");
        Scanner in=new Scanner(System.in);
        System.out.println("Enter Your first Number :");
        int num1=in.nextInt();
        System.out.println("Enter Your operation :");
        char symbol=in.next().charAt(0);
        System.out.println("Enter Your second Number :");
        int num2= in.nextInt();
        switch  (symbol){
            case '+':
                int answer=num1+num2;
                System.out.print(num1+ " + "+num2+" = "+answer);
                break;
            case '-':
                int answer2=num1-num2;
                System.out.print(num1+ " - "+num2+" = "+answer2+"   ");
                break;
            case '*':
                int answer3=num1*num2;
                System.out.print(num1+ " * "+num2+" = "+answer3+"   ");
                break;
            case '/':
                int answer4=num1/num2;
                System.out.print(num1+ " / "+num2+" = "+answer4+"   ");
                break;
            case '%':
                int answer5=num1%num2;
                System.out.print(num1+ " % "+num2+" = "+answer5+"   ");
                break;
            default:
                System.out.println("Enter valid operation!!!");
        }
    }
}
