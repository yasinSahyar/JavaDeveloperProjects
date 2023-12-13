package day16_NestedLoop;

public class FrequencyOfCharacters {
    public static void main(String[] args) {

        String str = "aacbbbcdd";
        char ch = 'c'; //'c' din kanchisi barkenligini dep berdu

        int count = 0;

        for (int i = 0; i < str.length(); i++) {// i: index number of str
            if (str.charAt(i) == ch){// if the character of the string is equal to the given character,
                count++;              // it means the given character has appeared in the string
            }

        }

        System.out.println(count);

    }
}

/*
Write a program that can find the frequency of the characters from a string

                         Ex:
                        str = "aaabbbbccccc";

                        output:
                                5


            Hint: if you find out how to find the frequency of one character, then repeat it for all the remaining characters

*/
