package day18_garbageCollection;

import day17_ClassObjectIntro.Employee.Employee;

class Car{
    public String brand;
    public String model;
    public String color;
    public int year;
}

public class MemoryAllocation {
    public static void main(String[] args) {
        int a = 100; //local variable --stack

        Car car = new Car();// reference variable--"new"
        //  stack      heap

        System.out.println("-----------------------------");

        Employee employee1 = new Employee();//day17 din qakirp isletuk
        Employee employee2 = employee1;//ohshash bir kimmet berdu employye1

        employee1.setInfo("kemal",35,'M',"java Developer",5500,"A124");
        System.out.println(employee1);
        System.out.println(employee2);

        System.out.println("-----------------");

        String batch1 = new String("java");
        String batch2 = batch1;
        String batch3 = batch2; //peket bir heap memuri saklindu

        System.out.println(batch3);


    }
    public static void method1(){
        int b = 200;//local variable --stack


    }
    public static void method2(){
        String c = "Hello Uyghur"; // it is inside string pool
        //    stack   --heap

        String d = new String("Hello Uyghur");// outside string pool ---cunki "new"


    }


}
