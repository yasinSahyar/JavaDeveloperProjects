package day17_ClassObjectIntro.Dog;

public class TestDogObjects {
    public static void main(String[] args) {

        Dog dog1 = new Dog();

        dog1.name = "max";
        dog1.breed = "Husky";
        dog1.gender = 'M';
        dog1.age = 4;
        dog1.size = "Large";
        dog1.color = "Black";

        Dog dog2 = new Dog();
        dog2.name = "kucuk";
        dog2.age = 3;

        Dog dog3 = new Dog();
        dog3.setInfo("aktush","chow chow",'M',3,"Medium","ak-kok");

        Dog dog4 = new Dog();
        dog4.setInfo("tohtash","torluk",'F',4,"smal","boz");


        System.out.println(dog1);//og{name='max', breed='Husky', size='Large', gender=M, age=4, color='Black'}
        System.out.println(dog2); //Dog{name='kucuk', breed='null', size='null', gender= , age=3, color='null'}
        System.out.println(dog3);//Dog{name='aktush', breed='chow chow', size='Medium', gender=M, age=3, color='ak-kok'}
        System.out.println(dog4);

        dog3.eat();//aktushis eating
        dog2.drink();
        dog4.drink();//tohtash is drinking water

    }
}
