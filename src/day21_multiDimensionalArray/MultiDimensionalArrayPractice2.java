package day21_multiDimensionalArray;

import java.util.Arrays;

public class MultiDimensionalArrayPractice2 {
    public static void main(String[] args) {

        int[][] arr2D1 = {{1,2}, {3,4,5}};
        int[][] arr2D2 = {{6,7,8,9}, {10,11},{12,13,14}};
        int[][] arr2D3 = {{15,16,17,18}};

        int[][][] arr3D = { {{1,2}, {3,4,5}}, {{6,7,8,9}, {10,11},{12,13,14}} , {{15,16,17,18}}};
        // index:                 0                     1                                 2
        //[index of 2D array] [index of 1D array] [index of elements]

        System.out.println(Arrays.deepToString(arr3D)); //3D array print

        System.out.println(Arrays.deepToString(arr3D[1]) );

        System.out.println(Arrays.toString(arr3D[0][1]));//3D ning 0.index ezasining 1.index elimintini yazdurdi

        System.out.println(arr3D[1][2][2]);//14

        System.out.println(arr3D[2][0][2]);//17

        System.out.println("-------------------------------------");

        for (int i = 0; i < arr3D.length; i++) {//i: index number of each 2 dimensional array
            int[][] each2DArray = arr3D[i];
            System.out.println(Arrays.deepToString(each2DArray));
            System.out.println("------------3D---------------");

            for (int j = 0; j < each2DArray.length; j++) {//j: index number of each 1 dimensional array

                int[] each1DArray = each2DArray[j];
                System.out.println(Arrays.toString(each1DArray));

                System.out.println("-----------2D-------------");

                for (int k = 0; k < each1DArray.length; k++) {//k: index number of each element

                    int eachElement = each1DArray[k];
                    System.out.println(eachElement);

                    System.out.println("---------1D-----------");
                }
            }
        }

    }
}
