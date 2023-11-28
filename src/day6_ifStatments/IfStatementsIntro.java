package day6_ifStatments;

public class IfStatementsIntro {
    public static void main(String[] args) {

        int number = -100;

        boolean isPositive = number > 0;
        boolean isNegative = number < 0;
        boolean isZero = number == 0;

        if (isPositive){
            System.out.println(number + " is positive");
        }
        if (isNegative){
            System.out.println(number + " is Negative");
        }
        if (isZero){
            System.out.println(number + " is Zero");
        }

        //-100 is Negative


        System.out.println("----------------------");

        int num = -10;

        if (num > 0){
            System.out.println(num + " is positive");
        }
        if (num < 0){
            System.out.println(num + " is Negative");
        }
        if (num == 0){
            System.out.println(num + " is Zero");
        }



    }
}
