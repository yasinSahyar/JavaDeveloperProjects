package day17_ClassObjectIntro;

public class UniqueCharacters1 {
    public static void main(String[] args) {

        String str = "aabcccd"; //bd

        String unique = ""; //unique--benzersiz

        for (int i = 0; i < str.length(); i++) {//i:index num
            char each = str.charAt(i);

            if (str.indexOf(each) == str.lastIndexOf(each) ) {
                unique += each;
            }
        }

        System.out.println(unique);
    }
}

/*
1. Write a program that can find the unique characters from a String
			Ex:
				str = "aabcccd"

				output:
					bd
 */
