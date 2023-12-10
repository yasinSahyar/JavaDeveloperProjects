package day13_CustomMethodsContinue;

public class ReturnStatment {
    public static void main(String[] args) {

        eligible(25);
        System.out.println("-----------------------------");

        System.out.println("Test1 started");

        boolean exit = true;
        if (exit){
            return;// main method gets terminated
        }
        System.out.println("Test1 completed");

        System.out.println("Test2 started");
        //Test1 started






    }

    public static void eligible(int age){
        if (age < 0 || age > 150){
            System.out.println("Invalid age :" + age);
            return;//exits the method
        }
        if (age >= 21){
            System.out.println("You are eligible tu buy alcohol");
        }else {
            System.out.println("You are not eligible to buy alcohol");
        }
    }
    // void --- bolsa "return" din kiyin bir kimmet birilmeydu


    public static int multiplication(int n1, int n2){ //void bolmihandikin "returin xxx" bulshi kerek
        int result = n1 * n2;
        return result; //"return" din kiyin qukum bir kimmet kilishi kerek "return result;" dek
    }
}
