package day16_NestedLoop;

import java.util.Scanner;

public class LogIn {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        String user,password;
        int attempt = 3; // deneme ketim sani

        do {
            System.out.println("Enter your user name :");
            user = input.next();

            System.out.println("Enter your password :");
            password = input.next();

            attempt--;
            if (attempt == 0){
                break;
            }

        }while (!(user.equals("urumci") && password.equals("Dimayman1")));//while the credentials(bilgiler) are invalid
    }
}
