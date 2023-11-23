package day5_operators;

public class shorthandOperators {
    public static void main(String[] args) {
        int a = 20;
        System.out.println(a);//20
        a = ++a;
        System.out.println(a); //21
        a = a++;
        System.out.println(a);//21

        int b = 30;
         b = --b;
        System.out.println(b);//29
        b = b--;
        System.out.println(b);//29

        System.out.println("-----");

        double balance  = 100;
        balance += 1000; // 100 + 100 = 1100.0
        System.out.println("balance = " + balance);

        balance += 500; // 1100 + 500 =1600.0
        System.out.println("balance = " + balance);

        balance -= 1000;// 1600.0 - 1000 / 600.0
        System.out.println("balance = " + balance);

        System.out.println("----------");

        double salary = 45000;
        salary *= 2; //salary = 45000 * 2 =90000.0
        System.out.println(salary);

        salary /= 3;//90000.0 / 3 = 30000.0
        System.out.println(salary);

        System.out.println("----------");

        int c = 37;
        c %= 7; // c = 39 % 7 = 4 -----39/7=5+4 yeni bulunme kalduki 4
        System.out.println(c);




    }
}
