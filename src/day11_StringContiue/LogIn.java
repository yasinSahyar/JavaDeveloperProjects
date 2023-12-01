package day11_StringContiue;

import java.util.Scanner;

public class LogIn {
    public static void main(String[] args) {

        String correctUserName = "urumci", // literal
                correctPassword = "Dimayman1"; // literal
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your user name :");
        String userName = input.nextLine(); // new

        System.out.println("Enter your password :");
        String password = input.nextLine();

        input.close();

        if (userName.equals(correctUserName)  && password.equals(correctPassword)){
            System.out.println("You are now logged in");
        }else {
            System.out.println("Incorrect userName and password,please try again");
        }
    }
}
