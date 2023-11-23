package day5_operators;

public class relationalOperators {
    public static void main(String[] args) {
        int a = 300;
        int b = 200;
       // System.out.println(a > b); //true

        boolean aIsGrater = a > b;
        System.out.println(aIsGrater); //true

        System.out.println("----------------------");
        int score = 75;
        boolean passed = score >= 60;  //true
        System.out.println(passed);

        System.out.println("----------");
        int age = 20;
        boolean eligibleToBuyAlcohol = age >= 21; //false
        System.out.println(eligibleToBuyAlcohol);

        boolean eligibleToVote = age >= 18; //true
        System.out.println(eligibleToVote);

        System.out.println("--------");

        System.out.println('a' > 'b');//true








    }
}
