package day19_Array;

public class MinNumber {

    public static void main(String[] args) {

        int [] numbers = {100,20,500,40,-15,50};
        int min = numbers[0]; //100

        for (int i = 1; i < numbers.length; i++) { //i:1,2,3,4,5
            if (numbers[i] < min){
                min = numbers[i];
            }
        }

        System.out.println("min = " + min); // 500
    }
}
