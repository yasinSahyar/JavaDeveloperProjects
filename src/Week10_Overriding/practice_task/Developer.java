package Week10_Overriding.practice_task;

import java.util.ArrayList;
import java.util.Arrays;

public class Developer extends Employee {

    private String programmingLanguage;

    public Developer(String name, int age, String gender, String employeeId, double salary) {
        super(name, age, gender, employeeId, salary);
    }

    public Developer(String name, int age, String gender, String employeeId, double salary, String programmingLanguage) {
        super(name, age, gender, employeeId, salary);
        setProgrammingLanguage(programmingLanguage);
    }

    public String getProgrammingLanguage() {
        if (programmingLanguage == null) {
            return "Java";
        }
        return programmingLanguage;
    }

    public void setProgrammingLanguage(String programmingLanguage) {

        ArrayList<String> list = new ArrayList<>(); // list of all the programming languages
        list.addAll(Arrays.asList(
                "Java", "Python", "C#", "Ruby", "C++"
        ));

        if (!list.contains(programmingLanguage)) {
            throw new RuntimeException("No Such A Programming Language: " + programmingLanguage);
        }

        this.programmingLanguage = programmingLanguage;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Programming Language: " + getProgrammingLanguage());
    }

    @Override
    public void work() {
        System.out.println("Developer " + getName() + " is coding in " + getProgrammingLanguage());
    }
}

/*
3. Create a subclass of Employee named Developer with the following specifications:
     Attributes:
       - programmingLanguage;

     Encapsulate the fields.
     Add a constructor that can set all the fields when the Developer object is created.
     Override the work and displayInfo methods.
 */