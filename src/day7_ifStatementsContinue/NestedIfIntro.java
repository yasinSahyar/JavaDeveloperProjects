package day7_ifStatementsContinue;

public class NestedIfIntro {
    public static void main(String[] args) {

        int score = -300;

        if (score >= 0 && score <= 100){
            if (score >= 60){
                System.out.println("Passed");
            }else {
                System.out.println("False");
            }
        }else {
            System.out.println("Invalid Score");
        }

        System.out.println("-------------------");

        //alkohol alma problemi
        int age = 32;//1~~120
        if (age >= 1 && age <= 120){
            if (age >= 21){
                System.out.println("Eligible");
            }else {
                System.out.println("Not Eligible");
            }
        }else {
            System.out.println("Invalid age");
        }

        System.out.println("------------------------");

        int day = 33;

        if (day >= 1 && day<= 7){
            if(day == 1){
                System.out.println("Monday");
            }else if(day == 2){
                System.out.println("Tuesday");
            }else if(day == 3){
                System.out.println("Wednesday");
            }else if(day == 4){
                System.out.println("Thursday");
            }else if(day == 5){
                System.out.println("Friday");
            } else if(day == 6){
                System.out.println("Saturday");
            } else{
                System.out.println("Sunday");
            }
        }else {
            System.out.println("Invalid Day");
        }



    }
}
