package day13_CustomMethodsContinue;

public class ReturnMethodIntro {
    public static void main(String[] args) {

       int total = addition(5,6);
       // System.out.println(total);//11

        int t = square(10);
        System.out.println(square(10));

        int r = cube(5);
        System.out.println(cube(5));

    }
/*
    public static void sum(int n1, int n2){
        int result = n1 + n2;
        System.out.println(result);
    }

 */

    public static int addition(int n1, int n2){
        int result = n1 + n2;
        return result;

    }

    public static int square(int num){
        int square = num * num;
        return square;
    }


    public static int cube(int num){
       // int cube = num * num * num;
        int cube = square(num) * num;
        return cube;
    }
}
