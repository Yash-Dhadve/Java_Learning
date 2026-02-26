// Create class Bank with method deposit(int amount).

public class Bank {
    
    String accountHolder;
    int balance;

    Bank(String accountHolder){
        this.accountHolder = accountHolder;
        balance = 0;
    }

    void deposit(int amount){
        this.balance += amount;
    }

    public static void main(String[] args) {
        Bank acc1 = new Bank("Yash");
        acc1.deposit(100);
        System.out.println("Account Holder Name: " + acc1.accountHolder);
        System.out.println("Account Balance: " + acc1.balance);
    }



}
