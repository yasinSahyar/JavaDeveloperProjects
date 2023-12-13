package day15_LoopContinue;

public class RemoveDuplicates {
    public static void main(String[] args) {

        String str = "aabbbccccd";
        String result = "";//"abcd"

        for (int i = 0; i < str.length(); i++) {//i: index number of str

            char each = str.charAt(i); //each character of the string str

            if (!result.contains(""+ each)) {//if the string result does not contain the character of string str yet
                result += each;// then we will add the character to string result
            }
        }
        System.out.println(result);
    }
}
