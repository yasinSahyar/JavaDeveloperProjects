package day12_CustomMethodsIntro;

public class CustomMethodWithParameter {
    public static void main(String[] args) {

        oddOrEven(254); //254 is even number

        System.out.println("-------------");

        oddOrEven(301);//301 is odd number

    }

    public static void oddOrEven(int number){
        if (number % 2 == 0){
            System.out.println(number + " is even number ");
        }else {
            System.out.println(number + " is odd number ");
        }
    }
}
