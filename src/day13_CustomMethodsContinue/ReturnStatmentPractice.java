package day13_CustomMethodsContinue;

import java.util.Scanner;

public class ReturnStatmentPractice {
    public static void main(String[] args) {

        char grade = new Scanner(System.in).next().charAt(0);
        boolean isValid = grade == 'A' || grade == 'B' || grade == 'C' || grade == 'D' || grade == 'F' ;
        if(!isValid){
            System.out.println("Invalid grade");
            return; //terminates the main method
        }
        System.out.println((grade == 'A')? "Excellent" :(grade == 'B')? "Great job" :(grade == 'C')? "Good"
                :(grade == 'D')? "Passed" : "Faild");
    }
}
