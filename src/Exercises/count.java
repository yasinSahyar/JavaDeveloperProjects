package Exercises;

public class count {
    public static void main(String[] args) {

        String str = " guess me";
        for (int i = 0; i < str.length(); i++) {
            str += str.substring(i, i + 1);
            System.out.println(str);


        }
    }
}
