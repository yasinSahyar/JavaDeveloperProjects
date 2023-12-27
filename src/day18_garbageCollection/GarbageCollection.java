package day18_garbageCollection;

import day17_ClassObjectIntro.Dog.Dog;

import java.util.Locale;

public class GarbageCollection {
    public static void main(String[] args) {

        //new GarbageCollection().finalize();//"GarbageCollection()"ni ishletsek "finalize()" aptumatik kelidu , kushushimiz hajetsiz

        String s1 = "Java";
        s1 = null;//"Java"will be eligible for garbage collection

        System.out.println(s1);//null
       // System.out.println(s1.toUpperCase());//null bolhacka hata beridu

        //System.out.println(s1.replace(null,"python"));//hata beridu--because "s1" is null
        System.out.println("--------------------------------");

        String str1 = "python";
            str1 = "Cydeo";

        System.out.println(str1);//Cydeo

        System.out.println("------------------------------------");

        Dog dog1 = new Dog();// in the heap
        dog1.setInfo("aktush","chow chow",'M',3,"Medium","ak-kok");

        Dog dog2 = new Dog();
        dog2.setInfo("kush","mao mao",'F',2,"Medium","topak");

        dog1 = dog2;

        System.out.println(dog1);//dog2
        System.out.println(dog2);//dog2

       // new Dog().finalize();







    }
}
