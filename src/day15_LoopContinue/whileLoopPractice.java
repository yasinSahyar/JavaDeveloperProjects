package day15_LoopContinue;

import java.util.Scanner;

public class whileLoopPractice {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your age: ");
        int age = input.nextInt();

        while (!(age >= 1 && age <= 120)){ //while the age is Invalid, so many time re-enter
            System.out.println("Invalid entry !,Please re-enter your age:");
            age = input.nextInt();
        }

        if (age >= 21){
            System.out.println("Eligible to buy Alcohol");
        }else {
            System.out.println("Not Eligible to buy Alcohol");
        }
    }
}
