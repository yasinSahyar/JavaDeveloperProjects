package day15_LoopContinue;

import java.util.Locale;
import java.util.Scanner;

public class EligibleToVote {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your age: ");
        int age = input.nextInt(); // valid age : 1~120

        while (!(age >= 1 && age <= 120)){ //while the age is Invalid, so many time re-enter
            System.err.println("Invalid entry !,Please re-enter your age:");
            age = input.nextInt();
        }

        System.out.println("Are you a US citizen? Yes/No");
        String yesOrNo = input.next().toLowerCase();

        while (!(yesOrNo.equals("yes") || yesOrNo.equals("no") )){ //while the answer is neither yes or no
            System.err.println("Invalid entry !,Please re-enter ");
            System.err.println("Are you a US citizen? Yes/No");
            yesOrNo = input.next().toLowerCase();
        }

        if (age >= 21 && yesOrNo.equals("yes")){
            System.out.println("Eligible to Vote");
        }else {
            System.out.println("Not Eligible to Vote");
        }

        input.close();
    }
}
