package day17_ClassObjectIntro.Dog;

public class Dog {

    public String name;// instance variable
    public String breed;
    public String size;
    public char gender;
    public int age;
    public String color;

                        //"Max"       "Husky"       'M'           4        "large"      "black"
    public void setInfo(String name, String breed, char gender, int age, String size, String color){
        this.name = name;//this keyword is used for calling th instance variable name
        this.breed = breed;
        this.gender = gender;
        this.age = age;
        this.size = size;
        this.color = color;

    }//this method can help us to set alla the information of the dog at once

    public void eat(){
        System.out.println(name + "is eating");
    }

    public void drink(){
        System.out.println(name +" is drinking water");
    }


    public String toString() { //buni qikrish uqun
        //mause ong qikish "Generate..." andin "toString"ni tallaymiz,andin "ok"
        return "Dog{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", size='" + size + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }
}
