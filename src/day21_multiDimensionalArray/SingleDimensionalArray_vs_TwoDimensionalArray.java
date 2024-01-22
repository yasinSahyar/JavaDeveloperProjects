package day21_multiDimensionalArray;

import java.util.Arrays;

public class SingleDimensionalArray_vs_TwoDimensionalArray {
    public static void main(String[] args) {

        int[] arr1D = new int[10];
        System.out.println(Arrays.toString(arr1D));

        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {6,7,8};
        int[] arr3 = {9,10,11,12};
        int[] arr4 = {13,14,15,16,17};
        int[] arr5 = {18,19,20,21};

        int[][] arr2D = new int[5][];//index:0~~4
        arr2D[0] = arr1;
        arr2D[1] = arr2;
        arr2D[2] = arr3;
        arr2D[3] = arr4;
        arr2D[4] = arr5;

        System.out.println(Arrays.deepToString(arr2D));


    }
}
