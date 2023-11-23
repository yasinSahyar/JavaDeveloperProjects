package day6_ifStatments;

public class OddOrEven {
    public static void main(String[] args) {
        int number = 45;
        boolean isEven = number % 2 == 0; // remainder is 0 ,means the number is even
        // boolean isOdd = number % 2 != 0; // remainder is not 0 , means the number is Odd
        boolean isOdd = !isEven;

        System.out.println(number + " is an even number: " + isEven); //false
        System.out.println(number + " is an odd number: " + isOdd); //true


    }
}
