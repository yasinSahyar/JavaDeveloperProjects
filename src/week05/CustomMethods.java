package week05;

public class CustomMethods {

    public static void main(String[] args) {

        //double n = calculate(1, '+', 2);

        calculate(1, '/', 0);

        calculate(10, '+', 30.5);


    }

    public static void calculate(double num1, char operator, double num2) {

        double result = 0;

        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 == 0) {
                    System.err.println("The denominator can not be zero " + operator);
                    System.exit(1);
                }
                result = num1 / num2;
                break;

            default:
                System.err.println("Invalid math operator: " + operator);
                System.exit(1);
        }

        System.out.println("Result: " + result);

    }


    public static void calculate(int num1, char operator, int num2) {

        int result = 0;

        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 == 0) {
                    System.err.println("The denominator can not be zero " + operator);
                    System.exit(1);
                }
                result = num1 / num2;
                break;

            default:
                System.err.println("Invalid math operator: " + operator);
                System.exit(1);
        }

        System.out.println("Result: " + result);

    }

}
/*
Create a method named calculate that accept three arguments:
            1. num1 (double)
            2. operator (char)
            3. num2 (double)

        if the operator is +:
                the method should return the addition of the two numbers

        if the operator is -:
                the method should return the subtraction of the two numbers

        if the operator is *:
                the method should return the multiplication of the two numbers

        If the operator is /:
                if denominator is NOT zero:
                    then the method should return the division

        for any other operators, the method should return 0
 */
