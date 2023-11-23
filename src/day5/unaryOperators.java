package day5;

public class unaryOperators {
    public static void main(String[] args) {
        // pre increment / decrement
        int x = 10;

        System.out.println(++x);//11
        System.out.println(x);//11

        int y = 100;

        System.out.println(--y);//99
        System.out.println(y);//99

        //post increment / decrement

        int a = 50;
        System.out.println(a++);//50    hemen ozgermeydu
        System.out.println(a);//51       kiyinkiside ozgireydu

        int b = 30;
        System.out.println(b--);//30
        System.out.println(b);//29
        System.out.println("--------------------");

        int n = 40;
        int m = n++; //m = 40
        System.out.println("n = " + n);//41
        System.out.println("m = " + m);//40

        int z = 60;
        int q = z--; //q=60 , z = 59
        System.out.println("z = " + z);//59
        System.out.println("q = " + q);//60

    }
}
