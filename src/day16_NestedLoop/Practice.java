package day16_NestedLoop;

public class Practice {
    public static void main(String[] args) {

       int a = 12;
       int b = 8;
       int result = findGrater(a,b);
        System.out.println(result);
    }

    private static int findGrater(int a, int b) {
        if(a > b){
            return a;
        }else {
            return b;
        }
    }
}

