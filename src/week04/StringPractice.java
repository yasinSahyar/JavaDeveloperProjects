package week04;

public class StringPractice {
    public static void main(String[] args) {

        String s1 = "Java Devoloper";
        String s2 = "Java Devoloper";
        String s3 = "Java Devoloper";

        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
        System.out.println(s2 == s3);

        System.out.println("------------------");

        String s4 = new String("Java Devoloper");
        String s5 = new String("Java Devoloper");

        System.out.println(s4 == s5);


    }
}
