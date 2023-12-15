package day16_NestedLoop;

import java.util.Locale;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String answer = "yes";

        while (answer.equals("yes")){

            System.out.println("Enter your first number:");
            double num1 = input.nextDouble();

            System.out.println("Enter the math operator:");
            char opr = input.next().charAt(0);

            while (!(opr == '+' || opr == '-' || opr == '*' || opr == '/' )){
                System.out.println("Invalid Operator! please re-enter the math operator ");
                opr = input.next().charAt(0);

                }

            System.out.println("Enter your second number:");
            double num2 = input.nextDouble();

            double result = (opr == '+')? num1 + num2 : (opr == '-')? num1 - num2 : (opr == '/')? num1 / num2 : num1 * num2 ;
            System.out.println("result = " + result);

            System.out.println("Would you like to continue?Yes/No");
            answer = input.next().toLowerCase();

            while(!(answer.equals("yes") && answer.equals("no"))){
                System.err.println("Invalid answer! Would you like to continue?Yes/No");
                answer = input.next().toLowerCase();

            }
        }


    }
}
