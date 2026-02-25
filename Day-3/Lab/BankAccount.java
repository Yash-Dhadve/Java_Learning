/*
Class: BankAccount

Instance variables:
accountHolder
balance

Static/Class variable:
bankName = "SBI"

Create 3 accounts and print:
Account holder
Bank name
Total accounts created
 */

public class BankAccount {
    String accountHolder = "";
    double balance = 0;

    static String bankName = "SBI";
    static int count = 0;

    BankAccount(String accountHolder, double balance){
        this.accountHolder = accountHolder;
        this.balance = balance;
        BankAccount.count++;
    }
    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount("Yash", 1000);
        BankAccount acc2 = new BankAccount("Lara", 2000);
        BankAccount acc3 = new BankAccount("Pavii", 1500);

        System.out.println("Account Holder: " + acc1.accountHolder);
        System.out.println("Bank name: " + BankAccount.bankName + "\n");

        System.out.println("Account Holder: " + acc2.accountHolder);
        System.out.println("Bank name: " + BankAccount.bankName + "\n");

        System.out.println("Account Holder: " + acc3.accountHolder);
        System.out.println("Bank name: " + BankAccount.bankName + "\n");

        System.out.println("Total accounts created: " + BankAccount.count);
    }
}
