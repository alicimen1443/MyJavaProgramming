package day31_Constructors;

public class BankAccount {

    public String accountHolder;// Instance means each object has its own copy
    public long accountNumber; // We create a class for the purpose of creating object later on. That's why we create the custom classes for. So that we can create the objects later on and then we can also store the data into the fields of object.
    public double balance;

    public void setInfo(String accountHolder, long accountNumber){
        this.accountHolder=accountHolder;
        this.accountNumber=accountNumber;

    }

    public String toString() {
        return "BankAccount{" +
                "accountHolder='" + accountHolder + '\'' +
                ", accountNumber=" + accountNumber +
                ", balance=$" + balance +
                '}';
    } //this method can help you to print bank account object by using the print statement

    public void checkBalance(){
        System.out.println("Your available balance is: "+balance);
    }

    public void deposit(double amount){
        if(amount<=0){
            System.out.println("Depositing amount cannot be zero or negative");
            return; // exits the method
        }
        balance+=amount;
    }

    public void withdraw(double amount){
        if(amount>balance){ // if withdrawing amount is grater than the available balance
            System.out.println("Insufficient balance");
            return;
        }
        if(amount<=0) { // if withdrawing amount is negative or zero
            System.out.println("Withdrawing amount cannot be zero or negative");
            return; // exits the method
        }

        balance-=amount;
    }




}
/*
BankAccount Task:
	        Attributes:
	                1. accountHolder, 2. accountNumber, 3. balance

	        Actions:
	        	1. setInfo(): sets the accountHolder and accountNumber attributes
	        	2. toString()
	            3. checkBalance():displays the available balance
	            2. deposit(): increases the balance by the given amount
				3. withdraw(): decreases the balance by the given amount
 */