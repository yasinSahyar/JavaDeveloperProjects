package day7_ifStatementsContinue;

public class LoanApplication {
    public static void main(String[] args) {

        int salary = 5500,
                creditScore = 680;
        String result = " ";

        if (salary >= 4500 && creditScore >= 700){
            result = "You are eligible for the loan";
        } else {
            result = "You are not eligible for the loan";
        }
        System.out.println(result);

    }
}
