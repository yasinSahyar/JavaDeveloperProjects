package week03;

public class ifStatements {
    public static void main(String[] args) {
        int number = 101;
        if (number % 2 == 0){
            System.out.println(number + " is an even number");
        }
        if (number % 2 != 0){
            System.out.println(number + " is an odd number");
        }

        int number1 = 31;

        boolean divisibleBy3 = number1 % 3 == 0;
        boolean divisibleBy5 = number1 % 5 == 0;

        String result = "";

        if (divisibleBy3 && divisibleBy5) {
            result = "FINRA";
        } else if (divisibleBy3) {
            result = "FIN";
        } else if (divisibleBy5) {
            result = "RA";
        } else {
            result =  String.valueOf(number1);
        }

        System.out.println(result);

        System.out.println("-----------------------------");





    }
}
