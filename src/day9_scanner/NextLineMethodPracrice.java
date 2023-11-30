package day9_scanner;

import java.util.Scanner;

public class NextLineMethodPracrice {
    public static void main(String[] args) {

        // peket "input.nextInt()" tin kiyinki kurda "input.nextLine()" kilip kalsa
        // kinyinki sualni kirguzmey turupla "Default" bulup kitip peket sualni besip chikirp koydu

        Scanner input = new Scanner(System.in); // Enter

        System.out.println("Enter your full name:");
        String full_name = input.nextLine();

        System.out.println("Enter you School name :");
        String school_name = input.nextLine();

        System.out.println("Enter your gender :");
        String gender = input.next(); // Male

        System.out.println("Enter your age :");
        int age = input.nextInt();// peket "input.nextInt()" tin kiyinki kurda "input.nextLine()" kilip kalsa
                                  // kinyinki sualni kirguzmey turupla "Default" bulup kitip peket sualni besip chikirp koydu

        //input.nextLine(); //yukardiki komentte yezilhan mesli hel kilis uqun musuhuni koshsak mesle hel bolidu
        System.out.println("Enter your street name :");
        String street = input.nextLine();

        System.out.println("full name :" + full_name);
        System.out.println("school name:" + school_name);
        System.out.println("gender :" + gender);
        System.out.println("age :" + age);
        System.out.println("street name :" + street);


    }
}
