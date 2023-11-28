package day7_ifStatementsContinue;

public class Grade {
    public static void main(String[] args) {

        char grade = 'B';
        String result = "";

        if (grade == 'A'){
            result = "Excellent";
        }
        if (grade == 'B'){
            result = "Great Job";
        }
        if (grade == 'C'){
            result = "Good";
        }
        if (grade == 'D'){
            result = "Passed";
        }
        if (grade == 'F'){
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
