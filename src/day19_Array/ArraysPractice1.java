package day19_Array;

import java.util.Arrays;

public class ArraysPractice1 {
    public static void main(String[] args) {

        String[] myGroup = new String[5];
        myGroup[0] = "James";
        myGroup[myGroup.length-1] = "Asel";

        myGroup[2] ="Sumeye";
        myGroup[1] = "Abdullah";

        System.out.println(Arrays.toString(myGroup));//[James, Abdullah, Sumeye, null, Asel]

        myGroup[1] = "Kuzzat";//change index 2

        System.out.println(Arrays.toString(myGroup));

        System.out.println("-----------------------");

        for (int i = myGroup.length-1; i >= 0; i--) {//ahirdin bashka karap yazidirdu
            System.out.println(myGroup[i]);
            //Asel,null,Sumeye,Kuzzat,James
            
        }

        System.out.println("------------------------");

        for (int i = myGroup.length - 1; i >= 0; i--) { //myGroup.forr--bu loop "i--"fonkisyon hazirlinidu

        }
    }
}
