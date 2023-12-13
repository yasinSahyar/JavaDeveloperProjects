package day16_NestedLoop;

import java.util.Scanner;

public class CydeoLogin {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your UserName: ");
        String user = input.next();

        System.out.println("Enter your Password: ");
        String password = input.next();

        if (user.equals("Cydeo") && password.equals("Dimayman")){//if the credentials are correct
            System.out.println("Logged in");

        }else {//otherwise
            for (int i = 0; i < 3; i++) { //i: 0,1,2
                if (i != 2){
                    System.err.println("Incorrect user name or password, please re-enter");
                }else {
                    System.err.println("This is your last chance, please re-enter user name and password");
                }


                System.out.println("Enter your user name:");
                user = input.next();

                System.out.println("Enter your Password: ");
                password = input.next();

                if (user.equals("Cydeo") && password.equals("Dimayman")){//if the user enters calid credentials
                    System.out.println("You are now Logged in");
                    break; //exits the loop
                }
            }

            if (! (user.equals("Cydeo") && password.equals("Dimayman"))){
                System.err.println("Your account now is locked, please contact with support team");
            }

        }

        input.close();

    }
}
