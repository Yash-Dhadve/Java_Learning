class Bank {
    private double balance;

    public void setBalance(double amount) {
        if (amount >= 0) {
            balance = amount;
        } else {
            System.out.println("Invalid amount!");
        }
    }

    public double getBalance() {
        return balance;
    }
}

public class Main {
    public static void main(String[] args) {
        Bank b = new Bank();
        b.setBalance(5000);
        System.out.println(b.getBalance());
    }
}