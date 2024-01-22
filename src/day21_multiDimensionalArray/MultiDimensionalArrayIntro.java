package day21_multiDimensionalArray;

import java.util.Arrays;

public class MultiDimensionalArrayIntro {
    public static void main(String[] args) {

        int[] arr1 = {10,20,30};
        int[] arr2 = {40,50,60,70,80};
        int[] arr3 = {90,100,110};
        int[] arr4 = {120,1000,1105};


        System.out.println("------------------------");

        int[][] arr2D = { {10,20,30},{40,50,60,70},{80,90}, arr4};

        System.out.println(arr2D.length);//4

        System.out.println(Arrays.toString(arr2D[1]));//[40, 50, 60, 70]
        System.out.println(Arrays.toString(arr2D[0]));//[10, 20, 30]

        System.out.println(arr2D[2][0]);//80---2.index arr ning 0.indexi diki san

        System.out.println(arr2D[1][2] );//60






    }
}
