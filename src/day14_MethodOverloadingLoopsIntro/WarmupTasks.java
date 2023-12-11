package day14_MethodOverloadingLoopsIntro;

public class WarmupTasks {

    public static void main(String[] args) {
        String str3 = combine("one","eight");//oneight
        //String str3 = combine("one","two");//onetwo
        //String str3 = combine("alim","malim");//alimalim
        System.out.println(str3);

    }

    public static String combine(String str1, String str2) {

        String result;
        if (str1.endsWith("" + str2.charAt(0)) ){ //if the first string ends with the first character of the second string
            result = str1 + str2.substring(1);
        }else {
            result = str1 + str2;
        }

        return result;

    }
}
