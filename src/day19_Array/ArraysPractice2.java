package day19_Array;

import java.util.Arrays;

public class ArraysPractice2 {
    public static void main(String[] args) {
        
        int[] arr1 = new int[100];

        for (int i = 0, j = 10; i < arr1.length;  i++, j+=10) {
            arr1[i] = j;//arr1 = [10, 20, 30, 40...990,1000]
            
        }

        System.out.println("------------------------------");

        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = i+1;//arr1 = [1, 2, 3...100]
        }

        System.out.println("arr1 = " + Arrays.toString(arr1));


        System.out.println("---------------------------");

        int[] arr2 = new int[100]; //index:0~99

        for (int i = 0, j= 100; i < arr2.length; i++, j--) {
            arr2[i] = j; //arr2 = [100, 99, 98....1]
        }

       /*  bu yukurdiki fonkisyonla ayni islem goryor
       for (int i = 0; i < arr2.length; i++) {
            arr2[i] = 100 - i;
        }
        */

        System.out.println("arr2 = " + Arrays.toString(arr2) );
    }
}
