package day19_Array;

import java.util.Arrays;

public class ArrayLiterals {
    public static void main(String[] args) {

        int [] numbers = new int[5];
        int [] nums = {10,20,30,40,50}; //Array Literal --degismez

        System.out.println(numbers.length);
        System.out.println(nums.length);

        System.out.println("numbers = " + Arrays.toString(numbers));
        System.out.println("nums = " + Arrays.toString(nums));

        System.out.println("------------------------------------");

        String[] days = {"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
        int n = 1;
        System.out.println(days[n-1]);


        System.out.println("---------------------------------------");

        String[] month = {"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};

        /*
        month = new String[12];
        month[0] = "Jan";
        .....
         */

        System.out.println("month = " + Arrays.toString(month) );


        System.out.println("----------------------------------------");

        for (int i = month.length - 1; i >= 0; i--) {
            System.out.println(month[i]); //Dec,Nov,Oct...Jan
        }

    }
}
