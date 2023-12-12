package day14_MethodOverloadingLoopsIntro;

public class ForLoopPractice {
    public static void main(String[] args) {

        for (int i = 10; i >= 5; i--) {//i:10,9,8,7,6,5
            System.out.println(i + "."+ "Nasilsin kukuli?");//1,2,3,4,5
        }

        System.out.println("------------------");

        //sum of all the numbers 1~100;
        int sum = 0;
        for (int i = 1; i <= 100 ; i++) {
            sum += i;
        }
        System.out.println(sum);//5050

        System.out.println("---------------------");


        //print all the alphabet letters a~z

        for (char i = 'A'; i <= 'Z' ; i++) {
            System.out.print(i + " ");//A B C D E F G H I J K L M N O P Q R S T U V W X Y Z
        }

        System.out.println("----------------------");

        // print all the alphabet in backwards

        for (char i = 'Z'; i >= 'A'; i--) {
            System.out.print(i + " ");//Z Y X W V U T S R Q P O N M L K J I H G F E D C B A
        }

    }
}
