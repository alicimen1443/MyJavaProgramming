package day35_Encapsulation.encapsulation;

public class BankAccount {
    private String accountHolder;
    private long accountNumber;
    private double balance=0;

    public BankAccount(String accountHolder, long accountNumber) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double deposit){
        if(deposit<=0){
            System.err.println("deposit cannot be negative or zero");
            System.exit(1);
        }
         balance+=deposit;
    }

    public void withdraw(double withdraw){
        if (withdraw <= 0) {
            System.out.println("Withdraw amount must be greater than zero");
            return;
        }
        if(balance>=withdraw) balance-=withdraw;
        else System.out.println("Insufficient balance!");
    }
    public void checkBalance(){
        System.out.println(accountHolder+"'s balance is :"+balance);
    }



    @Override
    public String toString() {
        return "BankAccount{" +
                "accountHolder='" + accountHolder + '\'' +
                ", accountNumber=" + accountNumber +
                ", balance=" + balance +
                '}';
    }
}
