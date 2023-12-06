package day12_CustomMethodsIntro;

import java.util.Scanner;

public class FormatFullNameScanner {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your first name: ");
        String first = input.next().trim().replace(" ","");//"replace"-- kirguzgen hatlarning arsidiki boslukni yok kilidu

        System.out.println("Enter your last name: ");
        String last = input.next().trim().replace(" ","");

        input.close();

        first = first.substring(0,1).toUpperCase() + first.substring(1).toLowerCase();
        //         "c"
        last = last.substring(0,1).toUpperCase() + last.substring(1).toLowerCase();

        System.out.println(first);//Yasin
        System.out.println(last);//Sahyar

        String full_name = first + " " + last;
        System.out.println(full_name);//Cydeo School
    }
}
