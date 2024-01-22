package day21_multiDimensionalArray;

import utility.ArraysUtility;

import java.util.Arrays;

public class AddElements {
    public static void main(String[] args) {

        int[] array = {1,2,3,4,5};
        int element = 6;

        int[] new_array = Arrays.copyOf(array,array.length + 1);
        new_array[new_array.length-1] = element;
        //function ozimiz yazduk

        System.out.println(Arrays.toString(new_array));
        //{1,2,3,4,5,6}

        System.out.println("---------------------------");

        int[] numbers = {100,90,80,70,60};
        numbers = ArraysUtility.addElement(numbers,50);
        //function qakirip kelduk

        System.out.println(Arrays.toString(numbers));

        System.out.println("---------------------------");

        double[] nums = {1.5,2.2,3.4,4.5};
        nums = ArraysUtility.addElement(nums,5.6);
        nums = ArraysUtility.addElement(nums,8.5);
        nums = ArraysUtility.addElement(nums,9.5);
        System.out.println(Arrays.toString(nums));

        System.out.println("---------------------------");

        String[] kisler = {"yasin","isa","kemal"};
        kisler = ArraysUtility.addElement(kisler,"ayjamal");
        kisler = ArraysUtility.addElement(kisler,"bilikiz");
        kisler = ArraysUtility.addElement(kisler,"zohragul");
        //function qakirip kelduk

        System.out.println(Arrays.toString(kisler));

    }
}
