package day7_ifStatementsContinue;

public class Grade2 {
    public static void main(String[] args) {

        char grade = 'A';

        String result = "";
        if (grade == 'A'){
            result = "Excellent";
        } else if(grade == 'B'){
            result = "Great Job";
        }else if(grade == 'C'){
            result = "Good";
        }else if(grade == 'D'){
            result = "Passed";
        }else {
            result = "Failed";
        }

        System.out.println(result);
    }
}


/*
*  Create a class called Grade, and a char variable named Grade is given. write a program to print the following messages:
            'A': excellent
            'B': great job
            'C': good
            'D': passed
            'F': failed
            Otherwise: invalid

            NOTE: MUST USE NESTED IF. DO NOT USE MORE THAN ONE PRINT STATEMENT*/
