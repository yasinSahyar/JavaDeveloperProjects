package week06_loop;

public class CydeoStudent {


    public String name;//instance variable

    public int age;

    public char gender;

    public String batch;//gurup

    public static String school = "Cydeo";

    public void setInfo(String name, int age, char gender, String batch) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.batch = batch;
    }

    public String toString(){
        return "CydeoStudent{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", batch='" + batch + '\'' +
                '}';
    }


}

/*
Instance vs static:
 instance: multiple copies
  static: ONLY one copy

* */
