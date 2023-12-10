package week06_loop;

public class TestCydeoStudentObjects {

    public static void main(String[] args) {
        CydeoStudent student1 = new CydeoStudent();
        student1.name = "Ayse";
        student1.age = 25;
        student1.gender = 'F';
        student1.batch = "JD Batch 2";

        CydeoStudent student2 = new CydeoStudent();
        student2.setInfo("yasin",34,'M',"SDET batch 10");

        CydeoStudent student3 = new CydeoStudent();
        student3.setInfo("juliya",39,'F',"CS batch 5");

        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);

        /*
        System.out.println(CydeoStudent.school);

        System.out.println(student1.school);
        System.out.println(student2.school);
        System.out.println(student3.school);

         */

    }
}
