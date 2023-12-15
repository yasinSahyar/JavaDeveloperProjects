package day16_NestedLoop;

public class NestedLoopIntro {
    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            System.out.println("Free Uyghur");
        }

        for (int i = 0; i < 5; i++) {
            System.out.println("Free Uyghur");
        }

        for (int i = 0; i < 5; i++) {
            System.out.println("Free Uyghur");
        }

        for (int i = 0; i < 5; i++) {
            System.out.println("Free Uyghur");
        }

        for (int i = 0; i < 5; i++) {
            System.out.println("Free Uyghur");
        }
        System.out.println("----------------------------------");

        //nested loop
        for (int i = 0; i < 5; i++) {//outer loop           if i=0
            for (int j = 0; j < 5; j++) { // inner loop        j=5
                System.out.println(i +"."+ " Free Uyghur " + j);

                /*
                0. Free Uyghur 0
                0. Free Uyghur 1
                .....
                1. Free Uyghur 0
                1. Free Uyghur 1
                ....
                2. Free Uyghur 0
                2. Free Uyghur 1
                ......
                4. Free Uyghur 3
                4. Free Uyghur 4
                 */
            }

        }
    }
}
