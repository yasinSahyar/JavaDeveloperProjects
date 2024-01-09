package day20_forEach;

import utility.ArraysUtility;

import java.util.Arrays;

public class Reverse { //revers--tersi ,tetursi
    public static void main(String[] args) {

        int[] array = {1,2,3,4,5,6,7,8,9,10};
        int[] reverse =  new int[array.length];//{10,9,8,7,6,5,4,3,2,1}

        for (int i = array.length - 1, j=0; i >= 0 ; i--) {
            reverse[j++] = array[i];
        }
        /* //ustidki bilen ohsha netije berdu
        for (int i = array.length - 1, j=0; i >= 0 ; i--,j++) {
            reverse[j] = array[i];
        }
         */

        System.out.println(Arrays.toString(reverse));

        System.out.println("------------------------------------");

        int[] nums ={100,200,300,400,500};
        nums = ArraysUtility.reverse(nums);

        System.out.println(Arrays.toString(nums));

        System.out.println("------------------------------------------");

        double[] a1 = {1.5, 2.3, 3.4, 4.6};
        a1 = ArraysUtility.reverse(a1);

        System.out.println(Arrays.toString(a1));

    }
}

/*
3. Write a program that can reverse an array of integers and returns it as new array
	        ex:
	            array = {1,2,3,4,5};

	        output:
	            reversedArray = {5,4,3,2,1};
 */