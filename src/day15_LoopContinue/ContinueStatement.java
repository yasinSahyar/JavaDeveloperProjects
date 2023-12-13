package day15_LoopContinue;

public class ContinueStatement {
    public static void main(String[] args) {

        for (int i = 0; i < 6; i++) {
            if (i == 4){ // 4 tin atlap otup ketidu
                continue;
            }
            System.out.println(i);//1,2,3,5
        }

        System.out.println("--------------------");

        for (int i = 10; i < 21; i++) {
            if (i % 2 == 0){ // jup numurdin atlap otup ketidu,peket tak numur yazidu
                continue;
            }
            System.out.println(i);//11,13,15...
        }

        System.out.println("--------------");

        for (char i = 'A'; i < 'G'; i++) {
            if(i == 'B')
                continue;

            if (i == 'E')
                continue;
           // if(i == 'B' || i == 'E')
             //   continue;

            System.out.println(i);//A,C,D,F


        }

        System.out.println("------------------------  1.hil usul");

        //50,52,54,56,...100
        for (int i = 50; i < 101; i += 2) {
            System.out.print(i + " ");

        }
        System.out.println("+++++++++++++++++++++   2.hil usul");

        //50,52,54,56,...100
        for (int i = 50; i < 101; i++) {
            if (i % 2 != 0){
                continue;
            }
            System.out.print(i + " ");

        }
        System.out.println("#######################   3.hil usul");

        //50,52,54,56,...100
        for (int i = 50; i < 101; i++) {
            if (i % 2 == 0){
                System.out.print(i + " ");

            }

        }
    }
}
