package day21_multiDimensionalArray;

import java.util.Arrays;

public class MultiDimensionalArrayPractice {
    public static void main(String[] args) {

        String[] group1 = {"isa","kemal","yasin","tunyaz"}; // 4 names
        String[] group2 = {"ayjamal","bilkiz","rukyem"}; // 3 names
        String[] group3 = {"lohman","emer","kurban","imin","osman"}; // 5 names
        String[] group4 = {"hamut","eysa"}; // 2 names

        String[][] groups = {group1,group2,group3,group4};
        //                    0       1      2      3
        for (int i = 0; i < groups.length; i++) {
            String[] eachGroup = groups[i];
            System.out.println(Arrays.toString(eachGroup)); //....[hamut, eysa]

            for (int j = 0; j < eachGroup.length; j++) {
                String eachStudent = eachGroup[j];
                System.out.println(eachStudent);//....hamut,eysa
            }
        }

        System.out.println("-----------------2--------------");

        for (String[] eachGroup : groups) {
            System.out.println(Arrays.toString(eachGroup));
            for (String eachStudent : eachGroup) {
                System.out.println(eachStudent);
            }
        }

        System.out.println("-----------------3------tetur yazidurush--------");

        for (int i = groups.length - 1; i >= 0; i--) {
            String[] eachGroup = groups[i];
            System.out.println(Arrays.toString(eachGroup)); //[hamut, eysa]....

            for (String eachStudent : eachGroup) {
                System.out.println(eachStudent); //hamut, eysa....
            }
        }
    }
}
