package day12_CustomMethodsIntro;

public class CustomMethodWithParameter2 {
    public static void main(String[] args) {

        int num1 = 100;
        oddOrEven(num1);

        int num2 = 35;
        oddOrEven(num2);

        int num3 = 78;
        oddOrEven(num3);

        int num4 = 39;
        oddOrEven(num4);

    }

    public static void oddOrEven(int number){
        if (number % 2 == 0){
            System.out.println(number + " is even number ");
        }else {
            System.out.println(number + " is odd number ");
        }
    }
}
