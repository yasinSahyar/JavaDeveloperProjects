package day19_Array;

import java.util.Arrays;

public class ArraysIntro {
    public static void main(String[] args) {

        int score1 = 85;
        int score2 = 75;
        int score3 = 92;
        int score4 = 81;
        int score5 = 79;

        System.out.println("-----------------------");

        int[] scores = new int[5];
        scores[2] = 92;
        scores[0] = 85;
        scores[1] = 75;
        scores[3] = 81;
        scores[4] = 79;

        //scores[5] = 100;//out of bound exception
        //scores[-1] = 69;//Index -1 out of bound exception

        //scores = new int[10]; //index: 0~9
        //scores = new int[50]; //index:0~49


        System.out.println(Arrays.toString(scores) );

        System.out.println(scores[2] );

        System.out.println("-------------------");

        for (int i = 0; i < scores.length; i++) {// i: index number of scores array
            System.out.println(scores[i]);

        }
        System.out.println("------------------------------");

        System.out.println(scores[scores.length-1]);



    }
}
