/*
Class: BankAccount

Properties:
accountHolder
balance

Child Class: SavingsAccount
Add interestRate

Method: calculateInterest()
Override method displayDetails()

Test by creating object and calling all methods.
 */

class BankAccount{
    protected String accountHolder;
    protected double balance;

    public BankAccount(String accountHolder, double balance){
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public void displayDetails(){
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: " + balance);
    }
}

class SavingsAccount extends BankAccount{

    private double interestRate;

    public SavingsAccount(String accountHolder, double balance, double interestRate){
        super(accountHolder, balance);
        this.interestRate = interestRate;
    }

    public double calculateInterest(){
        return balance * interestRate / 100;
    }

    @Override
    public void displayDetails(){
        super.displayDetails();
        System.out.println("Interest Rate: " + interestRate + "%");
        System.out.println("Calculated Interest: " + calculateInterest());
    }
}

public class Main{
    public static void main(String[] args) {
        SavingsAccount acc1 = new SavingsAccount("Yash", 1000, 2);
        acc1.displayDetails();
    }
}