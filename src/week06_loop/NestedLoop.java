package week06_loop;

public class NestedLoop {
    public static void main(String[] args) throws InterruptedException {

        for (int i = 15; i >=1 ; i--) {
           //System.out.println(i + "minute");

            for (int j = 59; j >= 0; j--) {


                /*
                System.out.println((i-1) + " minute" + j + " seconds");
                Thread.sleep(1000);//her bir print uqun bir sikunt saklaydu

                */


                /*
                14 minute59 seconds
                14 minute58 seconds
                14 minute57 seconds
                .....
                * */

                System.out.print( "\r"+(i-1) + " minutes " + j + " seconds");
                Thread.sleep(1000); //normal saat sekili




            }
        }


    }
}
