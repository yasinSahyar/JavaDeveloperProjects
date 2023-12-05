package day11_StringContiue;

public class StringhMethods3 {
    public static void main(String[] args) {

        //String word = "java";//false
        String word = ""; //true
        boolean r1 = word.isEmpty();

        System.out.println(r1);

        System.out.println("-----------------------");

        String str = "    ";
        boolean r2 = str.isEmpty();
        boolean r3 = str.isBlank();

        System.out.println("r2 = " + r2);//false --index 0 emes
        System.out.println("r3 = " + r3);// true ---- bos oldugu icin


        System.out.println("--------------------");

        String str1 = "Cydeo";
        String str2 = new String("Cydeo");
        System.out.println(str1 == str2);//false
        System.out.println(str1.equals(str2));//true--ayni karekter oldugu icin

        String str3 = new String("cydeo");
        System.out.println(str2.equals(str3));//false-- ayni karekter ama buyuk kucuk harif farki var

        System.out.println("---------------------------");

        String s1 = "JAVA";
        String s2 = "java";
        System.out.println(s1.equals(s2));//false
        System.out.println(s1.equalsIgnoreCase(s2));//true


        System.out.println("-------------------------------");

        String students = "Hasan Naran Sumeye Natalia Ekrem Yasin Ali";
        boolean hasAhmed = students.contains("Ahmed");
        boolean yasin = students.contains("Yasin");

        System.out.println("hasAhmed = " + hasAhmed);//false--lisetede bu isim oladigi icin
        System.out.println("yasin = " + yasin);//true

        boolean ekrem = students.toLowerCase().contains("ekrem");//true
        System.out.println("ekrem = " + ekrem);


        System.out.println("------------------------------");

        String name = "Micheal";
        boolean l = name.startsWith("Da");//false
        boolean m = name.startsWith("Mi");//true
        System.out.println(l);
        System.out.println(m);

        String url = "www.cydeo.com";
        boolean isValid = url.startsWith("www.");//"www." din baslinidu
        System.out.println(isValid);//true

        boolean t = url.endsWith(".com");//true ---".com" bilen ahirlishidu
        System.out.println(t);// true

        System.out.println("-----------------------");

        String email = "CydeoSchool@gmail.com";
        boolean isGmail = email.endsWith("gmail.com");
        boolean isYahoo = email.endsWith("yahoo.com");
        boolean isHotmail = email.endsWith("hotmail.com");

        System.out.println(isGmail);//true
        System.out.println(isYahoo);//false
        System.out.println(isHotmail);//false





    }
}
