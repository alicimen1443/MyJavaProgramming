package day35_Encapsulation.encapsulation;

public class BankAccountTest {
    public static void main(String[] args) {

        BankAccount bankAccount = new BankAccount("Ali Cimen",12345);

        System.out.println(bankAccount.getBalance());

        bankAccount.deposit(1000);

        System.out.println(bankAccount.getBalance());


    }
}
