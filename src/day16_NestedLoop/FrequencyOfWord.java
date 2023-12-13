package day16_NestedLoop;

import java.util.Locale;

public class FrequencyOfWord {
    public static void main(String[] args) {

        String sentence = "java JAVA jAvA JAva java "; //2 ---yani "java" digan hattin iki si bar
        String word = "java";

        //sentence = sentence.toLowerCase();//5
        //word = word.toLowerCase();

        int count = 0;

        while (sentence.contains(word)){
            count++;
            sentence = sentence.replaceFirst(word,"");//
        }
        System.out.println(count);

    }
}

/*
3.  Write a program that can return the frequency of the word java from a sentence
		    Ex:
		        sentence = "java JAVA jAvA JAva"

		    output:
		        4


        "Java Java Java Java"; //count = 0;
        " Java Java Java" // count = 1
        " Java Java" // count = 2;
        " Java"    // count = 3
        " "       // count = 4
 */
