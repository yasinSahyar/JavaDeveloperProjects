package day9_scanner;

import java.util.Scanner;

public class ScannerIntro {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);//for reading user inputs
        System.out.println("Enter your first number:");
        int num1= input.nextByte();

        System.out.println("Enter your second number:");
        short num2 = input.nextShort();

        System.out.println("Enter your third number:");
        int num3 = input.nextInt();

        input.close();//scanner is closed,can not read user inputs again

        System.out.println("first number : " + num1);
        System.out.println("second number : " + num2);
        System.out.println("third number :" + num3);

        System.out.println("---------------");

        System.out.println("toplami :" +(num1+num2+num3));
        System.out.println("cikartma :" +(num1-num2-num3));
        System.out.println("bolunme :" +(num1/num2/num3));
        System.out.println("carpma :" +(num1*num2*num3));



    }
}
