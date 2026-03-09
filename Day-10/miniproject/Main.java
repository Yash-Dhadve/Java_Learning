// Day-11 Add method displayDetails() in both classes and override in child.


class BankAccount{
    protected String accountHolder;
    private double balance;

    BankAccount(String accountHolder, double balance){
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public void deposit(double amount){
        if(amount> 0) balance += amount;
        else System.out.println("Invalid Amount");
    }

    public void withdraw(double amount){
        if (amount <= balance && amount > 0) balance-= amount;
        else System.out.println("Invalid Amount");
    }

    public double getBalance(){
        return balance;
    }

    public void displayDetails(){
        System.out.println("Account Holder: "+accountHolder);
        System.out.println("Account Balance: "+balance);
    }
}

class SavingsAccount extends BankAccount {
    private double interestRate;

    SavingsAccount(String name, double balance, double rate) {
        super(name, balance);
        this.interestRate = rate;
    }

    public double calculateInterest() {
        return getBalance() * (interestRate/100);
    }

    @Override
    public void displayDetails(){
        super.displayDetails();
        System.out.println("Account Interest Rate: "+interestRate);
        System.out.println("Calculated Interest: "+calculateInterest()+"\n");
    }
}

class Main{
    public static void main(String[] args) {
        SavingsAccount acc1 = new SavingsAccount("Yash Dhave", 1000, 2);

        System.out.println("Account Balance: "+acc1.getBalance());
        acc1.deposit(500);
        System.out.println("Account Balance After Depositing: "+acc1.getBalance());
        acc1.withdraw(200);
        System.out.println("Account Balance After Withdraw: "+acc1.getBalance()+"\n");
        acc1.displayDetails();
    }
}