package day19_Array;

public class MaxNumber {
    public static void main(String[] args) {

        int [] numbers = {100,20,500,40,-15,50};
        int max = numbers[0]; //100

        for (int i = 1; i < numbers.length; i++) { //i:1,2,3,4,5
            if (numbers[i] > max){
                max = numbers[i];
            }
        }

        System.out.println("max = " + max); // 500
    }
}
