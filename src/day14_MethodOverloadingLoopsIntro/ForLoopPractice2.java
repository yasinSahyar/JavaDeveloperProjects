package day14_MethodOverloadingLoopsIntro;

import java.util.Scanner;

public class ForLoopPractice2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int sum = 0;
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter a number");
            sum += input.nextInt(); // 10 times inter number
        }
        System.out.println("sum = " + sum);
/*
        System.out.println("Enter a number");
        int num2 = input.nextInt();

        System.out.println("Enter a number");
        int num3 = input.nextInt();
 */

    }
}
