package day11_StringContiue;

import java.util.Locale;

public class StringMethods1 {
    public static void main(String[] args) {

        String str1 = "CYdeo SCHool";
        str1 = str1.toLowerCase();// cydeo school
        System.out.println(str1);

        System.out.println("-------------------");

        String str2 = "java programing";
        str2 = str2.toUpperCase();//JAVA PROGRAMING
        String str3 = str2.toUpperCase();//JAVA PROGRAMING

        System.out.println(str2);
        System.out.println(str3);


        System.out.println("-------------------");

        String word = "WOoden SPoon";
        word = word.toUpperCase();//"WOODEN SPOON"
        word = word.toLowerCase();//"wooden spoon"

        System.out.println(word);


        System.out.println("-------------------");

        String str4 = "              Cydeo School";
        // System.out.println(str4);"              Cydeo School"
        str4 = str4.trim();// "Cydeo School"
        System.out.println(str4);


        System.out.println("-------------------");

        String sentence1 = "Today is Sunday, and we have java Class";
        int index1 = sentence1.indexOf('w');//'w' heriping index 21
        System.out.println(index1);

        String s1 = "I Love Java Programing";
        int firstA = s1.indexOf('a');//
        System.out.println(firstA);//8

        int secondA = s1.indexOf("a ");//10
        System.out.println(secondA);


        String s2 = "Java Python JavaScript Cydeo Python";
        int a1 = s2.indexOf('a');
        System.out.println(a1);//1

        int a2 = s2.indexOf("a ");
        System.out.println(a2);//3

        int a3 = s2.indexOf("vaS");
        System.out.println(a3);//14


        System.out.println("---------------------");

        String w = "java";
        System.out.println(w.indexOf('a'));//1
        System.out.println(w.lastIndexOf('a'));//3 --kiyinki 'a' ning indexi

        String w2 = "Java Python JavaScript Cydeo Python";
        System.out.println(w2.lastIndexOf('a'));//15--ahirki 'a'ning indexi
        System.out.println(w2.lastIndexOf('p'));//20






    }
}
