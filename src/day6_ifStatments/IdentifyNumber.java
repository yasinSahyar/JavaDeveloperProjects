package day6_ifStatments;

public class IdentifyNumber {
    public static void main(String[] args) {

        int number = -100;

        boolean isPositive =number > 0;
        boolean isNegative = number <0;
        //boolean isZero = number == 0;

        boolean isZero = !isPositive && !isNegative; //not positive not negative
        System.out.println(number + " is positive number: " + isPositive);
        System.out.println(number + " is negative number: " + isNegative);
        System.out.println(number + " is Zero : " + isZero);
    }
}
