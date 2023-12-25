package day18_garbageCollection.bankAccount;

public class testBankAccountObjects {
    public static void main(String[] args) {

        BankAccount obj1 = new BankAccount();
        obj1.setInfo("Yasin Sahyar",123456789);

        System.out.println(obj1);

        obj1.deposit(10000);
        obj1.checkBalance();

        obj1.withdraw(700);
        obj1.checkBalance();

        obj1.deposit(-1000);
        obj1.checkBalance();

        obj1.withdraw(2500);
        obj1.checkBalance();

        System.out.println("----------------------------");

        BankAccount account1 = new BankAccount();
        account1.setInfo("kemal bilal",785754875);

        BankAccount account2 = new BankAccount();
        account2.setInfo("isa memet",254565874);

        account1.deposit(5500);
        account2.deposit(6500);

        System.out.println(account1);
        System.out.println(account2);

        account1.withdraw(650);
        account2.withdraw(850);

        account1.checkBalance();
        account2.checkBalance();
    }
}
