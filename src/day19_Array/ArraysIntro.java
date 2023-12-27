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


        System.out.println(Arrays.toString(scores) );


    }
}
