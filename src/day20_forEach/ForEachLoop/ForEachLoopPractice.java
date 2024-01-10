package day20_forEach.ForEachLoop;

import java.util.Arrays;

public class ForEachLoopPractice {
    public static void main(String[] args) {

        int[] numbers = {1,2,3,4,5,6,7,8,9,10,11};

        for (int each : numbers) {
            if (each%2 != 0){
                System.out.println(each);//tak sanlar
            }
        }
        System.out.println("---------------------------");

        int[] nums = {100,20,3,40,55,66,70,85,19,108,11};
        int max = nums[0];
        int min = nums[0];

        for (int each : nums){
            if (each > max){
                max = each;
            }
            if (each < min){
                min = each;
            }
        }

        System.out.println("max = " + max);
        System.out.println("min = " + min);

        System.out.println("-------------------");

        int[] a1 = {10,20,30,40,50};
        int[] a2 = {60,70,80,90,100,130};
        int[] a3 = new int[a1.length + a2.length];

        int k = 0;
        for (int each : a1){
            a3[k++] = each;
        }
        for (int each : a2) {
            a3[k++]=each;
        }
        System.out.println(Arrays.toString(a3));//[10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 130]

        System.out.println("----------------------------");

        String[] names = {"Yasin Sahyar","Isa Memet","Kemal Bilal","Ayjamal Ehmet","Bilkiz Kasim"};

        for (String each : names){
            System.out.println(each.charAt(0) + "." + each.charAt(each.lastIndexOf(" ") + 1 ));//Y.S,I.M,K.B

        }
    }
}
