package day5_operators;

public class logicalOprators {
    public static void main(String[] args) {

        // &&: Logical  AND
        // || : Logical OR
        //  !  : Logical NOT

        double salary = 6000;
        int creditScore = 650;
        //&&
        boolean eligibleForLoan = salary >= 3000 && creditScore >= 650;
        System.out.println(eligibleForLoan);//true
        // false  &&  true  =  false
        // true   &&  true  =  true

        System.out.println("------------");
        // || OR:
        // false   &&  true  =  true

         int age = 18;
         String country = "Japan";
         boolean eligibleToVote = age >= 18 && country == "USA"; //false

        //String country = "USA";
         // boolean eligibleToVote = age >= 18 && country == "USA"; //true

        System.out.println(eligibleToVote);

        String answer = "yes";
        boolean validAnswer = answer == "yes" || answer == "no";
        System.out.println(validAnswer);
        System.out.println("-------------");

        char grade = 'C';
        boolean passedTheExame = grade == 'A' || grade == 'B' || grade == 'C' || grade == 'D';
        System.out.println(passedTheExame); //A,B,C,D = true


        System.out.println("--------");
        System.out.println(!true); //false

        String a = "yes";
        boolean yes = a == "yes";// true
        boolean no = !yes; //false

        System.out.println("yes = " + yes);
        System.out.println("no = " + no);












    }
}
