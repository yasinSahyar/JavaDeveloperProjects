package day15_LoopContinue;

import java.util.Scanner;

public class MaximumNumber {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int max = 0;//-2147483648

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter a number:");
            int num = input.nextInt();

            if (num > max){
                max = num;
            }

        }

        System.out.println("maximum number is : " + max);
        input.close();
    }
}
