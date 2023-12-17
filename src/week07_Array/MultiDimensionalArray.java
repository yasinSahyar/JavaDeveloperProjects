package week07_Array;

import java.util.Arrays;

public class MultiDimensionalArray {
    public static void main(String[] args) {

        String[][] JDB02_Students = {  {"Ayse", "Feyyaz", "Dauren"}, {"Erfan", "Gulnora", "Hoja","Mariia"}, {"Zafer", "Luka"}  };

        System.out.println( JDB02_Students[0][1] );

        System.out.println(JDB02_Students[2][1]);

        System.out.println("-----------------------------------------");

        for (String[] eachRow : JDB02_Students) {
            System.out.println(Arrays.toString(eachRow));
            for (String eachColumn : eachRow) {
                System.out.println(eachColumn);
            }
        }


        System.out.println("-----------------------------------------");

        String[][][] JD_Students ={ JDB02_Students };

        System.out.println(JD_Students[0][1][2]);

        // System.out.println(JD_Students[1][2][0]);

        for (String[][] eachSheet : JD_Students) {
            System.out.println(Arrays.deepToString(eachSheet));
            for (String[] eachRow : eachSheet) {
                System.out.println(Arrays.toString(eachRow));
                for (String eachColumn : eachRow) {
                    System.out.println(eachColumn);
                }
            }
        }

    }
}
