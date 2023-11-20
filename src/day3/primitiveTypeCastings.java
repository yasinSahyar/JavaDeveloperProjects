package day3;

public class primitiveTypeCastings {
    public static void main(String[] args) {
        //-----Implicit Casting---

        byte a = 15;
        short b = a;
        //short b = (short)a;
        System.out.println(b);

        int c = a; //implicit casting

        long d = 3000;

        float f = d;//implicit casting

        //-----Explicit Casting---
        int x = 100;
        byte y = (byte) x;
        float z = 20.8F;
        short q = (byte)z;//z = 20.8;
        System.out.println(q);
        double n1 = 2.5;
        byte n2 = (byte) n1; //n1=2.5;
        System.out.println(n2);
        System.out.println("-----------");
        int num = 500;
        byte result = (byte) num;//Explicit Casting
        System.out.println(result);

        int r = 5000;
        short t = (short) r;
        System.out.println(t);
        System.out.println("----------");
        double u = 3000.5;
        int p = (int) u;//Explicit Casting
        System.out.println(p);

        int o = 100;
        double d1 = 0;
        System.out.println(d1);





    }
}
