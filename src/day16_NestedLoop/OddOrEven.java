package day16_NestedLoop;

import java.util.Locale;
import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        while (true){ // while kulandigmiz icin sorular tekrarlanyor

            System.out.println("Enter a number:");
            int number = input.nextInt();

            /*
            while (!(number == ) ){
                System.out.println("Invalid Entry!, please enter a number ");
            }

             */

            if (number %2==0){
                System.out.println(number + " is an even number");
            }else {
                System.out.println(number + " is an odd number");
            }

            System.out.println("Would you like to enter another number? Yes/No");
            String answer = input.next().toLowerCase();

            while (!(answer.equals("yes") || answer.equals("no"))){//while the user enter invalid answer
                System.err.println("Invalid Entry! , Would you like to enter another number? Yes/No ");
                answer = input.next().toLowerCase();
            }

            if (answer.equals("no")){
                break;
            }

        }

    }
}
