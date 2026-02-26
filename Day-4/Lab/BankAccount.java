
/*
Class: BankAccount

Properties:
accountHolder
balance

Methods:
deposit(amount)
withdraw(amount)
checkBalance()

Create 1 object and test all methods.
 */
public class BankAccount {
    
    private String accountHolder;
    private int balance;

    BankAccount(String accountHolder){
        this.accountHolder = accountHolder;
        this.balance = 1000;
    }

    void deposit(int amount){
        if(amount > 0){
            this.balance += amount;
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }

    void withdraw(int amount){
        if(amount > 0 && amount <= balance){
            balance -= amount;
            System.out.println("Withdrawal successful!");
        } else {
            System.out.println("Invalid or insufficient balance!");
        }
    }

    void checkBalance(){
        System.out.println("Account Balance: "+balance+"\n");
    }
    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount("Yash");

        System.out.println("Account Holder Name: "+acc1.accountHolder);
        acc1.checkBalance();

        System.out.println("\nDepositing 500...");
        acc1.deposit(500);
        acc1.checkBalance();

        System.out.println("\nWithdrawing 200...");
        acc1.withdraw(200);
        acc1.checkBalance();

        System.out.println("\nChecking Balance...");
        acc1.checkBalance();
    }
}
