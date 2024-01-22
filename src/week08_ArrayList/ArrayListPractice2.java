package week08_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class ArrayListPractice2 {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.addAll(Arrays.asList("Anna", "Canada", "Bob", "David", "Lan", "Abida", "Ebrahim", "Farida"));

        //Predicate<String> sameFirstAndLastChar = p -> p.toLowerCase().charAt(0) == p.toLowerCase().charAt(p.length()-1);

        // list.removeIf(sameFirstAndLastChar);
        list.removeIf(p -> p.toLowerCase().charAt(0) == p.toLowerCase().charAt(p.length()-1));

        System.out.println(list);

    }

}

/*
 1. Write a program that can remove string elements from an arraylist if the first and last characters of the string are same
    ex:
        list = {"Anna", "Canada", "Bob", "David", "Lan", "Abida", "Ebrahim", "Farida"}

    output:
        ["Canada", "Lan", "Ebrahim", "Farida"]

 */