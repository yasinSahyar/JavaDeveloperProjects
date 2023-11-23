package day4_concatenation;

public class artimatic {
    public static void main(String[] args) {
        int x = 10;
        int y = 22;
        double a =10;
        double b = 22;


       System.out.println(x + y);
        System.out.println(x - y);
        System.out.println(x * y);
        System.out.println(y / x);
        System.out.println(x / y);
        System.out.println( y % x);
        System.out.println(x % y);
        System.out.println( a % b);

        System.out.println(x+++x); //21(10 + 11=21)
        System.out.println(x++ + ++y);//34(11 + 23 = 34)
        System.out.println(x+++ ""+x); //1213
        System.out.println( ++x % 5);



        System.out.println(x+=y);
        System.out.println(x*=y);
        System.out.println(x%=y);

        System.out.println(x>y);
        System.out.println();

        System.out.println("-----");
        int z = 2;
        int result = z++ + z++ * --z / z++ - --z + 3; //2 +

        System.out.println("result = " + result);




    }
}
