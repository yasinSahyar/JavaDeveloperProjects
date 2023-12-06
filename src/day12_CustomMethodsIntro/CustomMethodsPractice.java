package day12_CustomMethodsIntro;

public class CustomMethodsPractice {
    public static void main(String[] args) {
        maxNum(555,587); //587.0 is the maximum number

        System.out.println("---------------------------");

        maxNum(15254,25478); //25478.0 is the maximum number

        System.out.println("---------------------");

        initial("yasin","sahyar");//initial is :y.s

        initial("yasin","zulfinur"); //initial is :y.z
        initial("java","programing"); // initial is :j.p


    }

    //create a method that can print the maximum number between two numbers,if both are equal then it print "Equal",(num1, num2)
    public static void maxNum(double num1, double num2){
        if (num1 > num2){
            System.out.println(num1 + " is the maximum number");
        }else if(num2 > num1){
            System.out.println(num2 + " is the maximum number");
        }else {
            System.out.println("Equal");
        }


    }


    //create a method that can display the initials of a person (firstName, lastName)
    public static void initial(String firstName, String lastName){
        String initials = firstName.charAt(0) + "." + lastName.charAt(0);

        System.out.println("initial is :" + initials);
    }
}



/*
Create a method named capitalization that can format the first and last names of the person and display the full name of the person
    Ex:
        capitalization("cyDeO", "sCHooL")

        output:
            full name: Cydeo School


* */
