package week07_Array;

import java.util.Arrays;
import java.util.Collections;

public class UniqueElements {
    public static void main(String[] args) {


        String[] words = {"Java", "Python", "Python", "Ruby", "Ruby", "C#"};

        for (int j = 0; j < words.length; j++) {

            String element = words[j];
            int frequency = 0;
            for (int i = 0; i < words.length; i++) {
                if(words[i].equals(element)){
                    frequency++;
                }
            }

            if(frequency == 1){
                System.out.println(element);
            }

        }

        System.out.println("-----------------------------------");

        for (String each : words) {
            if( Collections.frequency(Arrays.asList(words), each) == 1){
                System.out.println(each);
            }
        }


    }
}
