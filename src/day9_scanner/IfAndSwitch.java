package day9_scanner;

public class IfAndSwitch {
    public static void main(String[] args) {

        int number = 50; // 20 crew,30 passengers
        if (number==50 || number==75 || number==100){
            switch (number){
                case 50:
                System.out.println("20 crew,30 passengers");
                     break;

                case 75:
                    System.out.println("25 crew, 50 passengers");
                    break;

                case 100:
                    System.out.println("30 crew, 70 passengers");
                    break;
            }
        }else {
            System.out.println("Invalid Number");
        }
    }
}
