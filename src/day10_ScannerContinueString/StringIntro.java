package day10_ScannerContinueString;

import java.util.Scanner;
import java.lang.String;
import java.lang.System;

public class StringIntro {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String str = "java";

        System.out.println();

        input.close();
        System.out.println("-------------");

        String s1 = "cat";
        String s2 = "dog";

        String s3 = "cat";
        String s4 = "dog";

        System.out.println(s1 == s3);
        System.out.println(s1 == s4);
        System.out.println(s3 == s4);
        System.out.println(s2 == s4);

        System.out.println("-------------");

        String str1= new String("Java");//create two objects: 1.string pool, 2. in heap(outside string)
        String str2= new String("Java");

        System.out.println(str1 == str2);//false

        System.out.println("--------------------");

        String t1 = "Python"; //inside string pool
        String t2 = new String("Python");//"new" bolhanqka outside string pool da
        String t3 = new String("Python");

        System.out.println(t1);
        System.out.println(t2);
        System.out.println(t3);

        System.out.println(t1 == t2);//false, qunki t1 inside string pool da , t2 outside string pool da
        System.out.println(t2 == t3);//false ,qunki t2,t3 ler "new" bolhaqka outside string pool da ayrim ayrim






    }
}
