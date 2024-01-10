package day20_forEach;

import java.util.Arrays;

public class ArrayUtilityMethods {
    public static void main(String[] args) {

        //iteration----kiqiktin chongha karap tizish

        int[] score = {70,100,80,95,65};

        System.out.println(Arrays.toString(score));


        String result = Arrays.toString(score);

        System.out.println(result);

        System.out.println("-------------------------------------------");

        //Arrays.equals
        int[] a1 = {1,2,3,4,5};
        int[] a2 = {1,2,3,4,5};

        boolean r1 = Arrays.equals(a1,a2);

        System.out.println(r1);//true

        char[] ch1 = {'A','B','C'};
        char[] ch2 = {'A','C','B'};

        boolean r2 = Arrays.equals(ch1,ch2);

        System.out.println(r2);//false

        String[] s1 = {"A","B","C"};
        String[] s2 = {"C","A","B"};

        System.out.println(Arrays.equals(s1,s2));//false

        System.out.println("-----------------------------------");


        int[] nums = {70,100,80,95,499,32,41,152,265,68};
        System.out.println(Arrays.toString(nums));

        Arrays.sort(nums);//kichiktin chongha karap tizip berdu
        System.out.println(Arrays.toString(nums));

        System.out.println("Minimum number " + nums[0]);//32  --- qunki ustide "Arrays.sort" function bolhanqka
        System.out.println("Maximum number " + nums[nums.length-1]);//499

        System.out.println("--------------------------------------");

        //Arrays.sort
        String[] d1 = {"A","B","C"};
        String[] d2 = {"C","A","B"};

        Arrays.sort(d1);
        Arrays.sort(d2);
        System.out.println(Arrays.equals(d1,d2)); //true


        System.out.println("--------------------------------------");

        String[] students= {"isa","kemal","yasin","ayjamal","bilikiz","zohregul"};
        System.out.println(Arrays.toString(students)); //normal tertipte

        Arrays.sort(students);
        System.out.println(Arrays.toString(students));//a~z tertipte tizip berdu


        System.out.println("-----------------------------------");


        //Arrays.copyOf
        int[] array = {10,70,80,95,39,32,41,152,265,68};
        int[] array2 = Arrays.copyOf(array,12);
        //int[] array2 = Arrays.copyOf(array,3);//[10, 70, 80]

        System.out.println(Arrays.toString(array2));//[10, 70, 80, 95, 39, 32, 41, 152, 265, 68, 0, 0]


        int[] n1 = {1,2,3,4,5};
        int[] n2 = {6,7,8,9,10,11,12};

        int[] n3 = Arrays.copyOf(n1,n1.length + n2.length);

        for (int i = 0, j= n1.length; i < n2.length; i++,j++) {
            n3[j] = n2[i];
        }
        System.out.println(Arrays.toString(n3));//[1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12]


        System.out.println("-----------------------------------");

        //Arrays.copyOfRange()

        char[] ch = {'A','B','C','D','E','F','G'};
        char[] result1 = Arrays.copyOf(ch,15);

        System.out.println(Arrays.toString(result1));//[A, B, C, D, E, F, G,  ,  ,  ,  ,  ,  ,  ,  ]

        char[] result2 = Arrays.copyOfRange(ch,2,5);//indexi 2~5 kiqe bolhinnila yazdir
        System.out.println(Arrays.toString(result2));//[C, D, E]

        char[] result3 = Arrays.copyOfRange(ch,3,ch.length);//indexi 3~ eng ahirhiche bolhinnila yazdir
        System.out.println(Arrays.toString(result3));//[D, E, F, G]








    }
}
