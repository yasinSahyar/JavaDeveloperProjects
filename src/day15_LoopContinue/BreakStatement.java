package day15_LoopContinue;

public class BreakStatement {
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            if (i == 6){//if i's value reaches 6 exits the loop
                break;// 6- da tohtaydu, kiyinkisini yazdurmaydu
            }
            System.out.println(i);
        }

        System.out.println("----------------");

        for (char i = 'A'; i <= 'Z' ; i++) {
            System.out.println(i);
            if(i == 'J'){
                break; //J- da tohtaydu, kiyinkisini yazdurmaydu
            }

        }
    }
}
