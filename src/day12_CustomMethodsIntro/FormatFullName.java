package day12_CustomMethodsIntro;

public class FormatFullName {
    public static void main(String[] args) {

        String first = "cyDEo";
        String last = "sCHOOL";

        first = first.substring(0,1).toUpperCase() + first.substring(1).toLowerCase();
        //         "c"
        last = last.substring(0,1).toUpperCase() + last.substring(1).toLowerCase();

        System.out.println(first);//Cydeo
        System.out.println(last);//School

        String full_name = first + " " + last;
        System.out.println(full_name);//Cydeo School


    }
}
