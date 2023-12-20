package day17_ClassObjectIntro.Employee;

public class Employee {
    public String name;
    public int age;
    public char gender;
    public String jobTitle;
    public double salary;
    //public static double salary;// "static" bolsa hammising salary si ohshash bulup kalidu
    public String id;

    public void setInfo(String name, int age, char gender, String jobTitle, double salary, String id) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.jobTitle = jobTitle;
        this.salary = salary;
        this.id = id;
    } //sets all the attributes of the Employee object at once

    //@Override - simdilik bunu silebilirz
    public String toString() { // to avoid getting hash code when we print
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                ", id='" + id + '\'' +
                '}';
    }

    public void work(){
        System.out.println(name + " is working");
    }



}
