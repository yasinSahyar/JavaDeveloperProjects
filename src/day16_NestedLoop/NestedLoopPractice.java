package day16_NestedLoop;

public class NestedLoopPractice {
    public static void main(String[] args) {

        String str = "aaabbccccddeeeeffhhhgg";

        String result = "";//"bdfg" -- 2 taneden olan harifleri yazdiryor

        for (int j = 0; j < str.length(); j++) {

            char ch = str.charAt(j);//each character of str
            int count = 0;

            for (int i = 0; i < str.length(); i++) { //str.length()--last index number
                if (str.charAt(i) == ch){
                    count++;
                }
            }
            if (count == 2 && !result.contains(""+ ch)){
                result += ch;
            }

        }
        System.out.println(result);


    }
}
