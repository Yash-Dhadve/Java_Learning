class Account {
    private String accountHolder;
    private double balance;

    Account(String accountHolder) {
        this.accountHolder = accountHolder;
        this.balance = 0;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit successful.");
        } else {
            System.out.println("Invalid amount!");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal successful.");
        } else {
            System.out.println("Invalid amount or insufficient balance!");
        }
    }

    public double getBalance() {
        return balance;
    }

    public String getAccountHolder() {
        return accountHolder;
    }
}

public class Main3 {
    public static void main(String[] args) {
        Account acc1 = new Account("Yash");

        acc1.deposit(5000);
        System.out.println("Balance after deposit: " + acc1.getBalance());

        acc1.withdraw(2000);
        System.out.println("Balance after withdrawal: " + acc1.getBalance());

        acc1.withdraw(4000); 
    }
}