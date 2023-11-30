package day10_ScannerContinueString;

import java.util.Scanner;
public class ShippingAddress {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);//"System.in"--- is print in the consul

        System.out.println("Enter your full name: ");
        String full_name = input.nextLine();

        System.out.println("Enter your building number :");
        String building_number = input.nextLine();

        System.out.println("Enter your street name :");
        String street_name = input.nextLine();

        System.out.println("Enter your city name :");
        String city_name = input.nextLine();

        System.out.println("Enter your state name :");
        String state_name = input.nextLine();

        System.out.println("Enter your zip code :");
        String zip = input.nextLine();

        System.out.println("Enter your country :");
        String country_name = input.nextLine();


        System.out.println("full name : " +full_name);
        System.out.println("building number :" + building_number);
        System.out.println("street name :" + street_name);
        System.out.println("city name :" + city_name);
        System.out.println("state name :" + state_name);
        System.out.println("zip code : " + zip);
        System.out.println("country name : " + country_name);

        System.out.println("----------------------");

        System.out.println("Your shipping address is :");
        System.out.println("\t" + full_name);
        System.out.println("\t" + street_name + building_number);
        System.out.println("\t" + zip + " " + city_name );
        System.out.println("\t" + state_name+ " " + country_name);


        input.close();
    }
}
