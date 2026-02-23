package Lab;
/*Create a Bank class

Properties:
accountHolder
balance

Create object and print details.
(No methods yet — only properties)*/

public class Bank {
    String accountHolder;
    double balance;

    public static void main(String[] args) {
        Bank acc1 = new Bank();
        Bank acc2 = new Bank();

        acc1.accountHolder = "Yash";
        acc1.balance = 1000;

        acc2.accountHolder = "Lara";
        acc2.balance = 1500;

        System.out.println("Name: "+acc1.accountHolder);
        System.out.println("Balance: "+acc1.balance+"\n");

        System.out.println("Name: "+acc2.accountHolder);
        System.out.println("Balance: "+acc2.balance);

    }
}
