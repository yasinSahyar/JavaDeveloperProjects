package day14_MethodOverloadingLoopsIntro;

public class StringReverse {

    public static void main(String[] args) {

        String str = "java";
        //            0123
                 //"avaJ"
        String revers = "";//"avaJ"
        // for (int i = 3; i >= 0 ; i--)
        for (int i = str.length() -1; i >= 0 ; i--) {
            revers += str.charAt(i);
        }
        System.out.println(revers); //avaj

        System.out.println("--------------------");

        String name = "yasin Sahyar Uyghur";
        String result = revers(name);

        System.out.println(result); //ruhgyU rayhaS nisay

    }


    public static String revers(String str){
        String revers = "";
        for (int i = str.length() -1; i >= 0 ; i--) {
            revers += str.charAt(i);
        }
        return revers;
    }
}
