package Week10_Overriding;

public class Person {

    private String name;
    private int age;
    private String gender;

    public Person(String name) {
        setName(name); // this.name = name;
    }

    public Person(String name, int age) {
        this(name); // setName(name);
        setAge(age);
    }

    public Person(String name, int age, String gender) {
        this(name, age); //setName(name); , setAge(age);
        setGender(gender);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {

        if(age < 0){
            throw new RuntimeException("Age can not be negative: " + age);
        }

        this.age = age;
    }

    public String getGender() {
        if (gender == null){
            //   throw new RuntimeException("Gender has not ben set");
            return "Unknown";
        }
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }


    @Override
    public String toString() {
        return getClass().getSimpleName() + "{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", gender=" + getGender() +
                '}';
    }



}

/*
1. Create a class named Person with the following specifications:
     Attributes:
       - name (String)
       - age (int)
       - gender (char)

     Encapsulate all the fields.
     Add a constructor that can set all the fields when the Person class is created.

     Actions:
       - toString()
 */