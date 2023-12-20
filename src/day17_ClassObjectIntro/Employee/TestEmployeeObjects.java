package day17_ClassObjectIntro.Employee;

public class TestEmployeeObjects {
    public static void main(String[] args) {

        Employee employee1 = new Employee();
        employee1.setInfo("yasin",35,'M',"Java Developer",4500,"A34");

        Employee employee2 = new Employee();
        employee2.setInfo("jemis",36,'M',"ETS Developer",4900,"B51");

        Employee employee3 = new Employee();
        employee3.setInfo("janne",42,'M',"DevOps",5500,"K05");

        employee2.age = 55;//employee2 ning yeshini ozgartsak pakat mushningla ozgiraydu , bashkishi ozgarmaydu

        System.out.println(employee1);//{name='yasin', age=35, gender=M, jobTitle='Java Developer', salary=4500.0, id='A34'}
        System.out.println(employee2);
        System.out.println(employee3);

        employee1.work();//yasin is working
        employee3.work();



    }
}
