package day7_ifStatementsContinue;

public class NetIncomeClaculate {
    public static void main(String[] args) {

        int salary = 115000;
        boolean isMarried = true;

        double taxRate = 0;

        if (salary >= 130000){ //35 % for salary of 130k or more
            taxRate = 0.35;
        }
        if (salary >= 100000 && salary < 130000){//30 % for salary of 100k or to 129k
            taxRate = 0.3;
        }
        if (salary >= 80000 && salary < 100000){//25 % for salary of 80k or 99k
            taxRate = 0.25;
        }
        if (salary < 80000){ //20 % for salary of 79k or less
            taxRate = 0.2;
        }

        if (isMarried){ // if the person is married
            taxRate -= 0.05; // tax is reduced by 5%
        }

        double totalTax = salary * taxRate;

        double netIncome = salary * (1-taxRate);

        System.out.println("salary = $" + salary);
        System.out.println("totalTax = $" + totalTax );
        System.out.println("netIncome = $" + netIncome);




    }
}
/*
35 % for salary of 130k or more
30 % for salary of 100k or to 129k
25 % for salary of 80k or 99k
20 % for salary of 79k or less

in addition:
    if the person is married , he /she will pay 5% less tax
 */
