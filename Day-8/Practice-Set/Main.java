/*
Create abstract class Payment
Abstract method pay()
Create child class UPIPayment implementing pay()
*/

abstract class Payment{
    abstract void pay();
}

class UPIPayment extends Payment{
    double amount;

    UPIPayment(double amount){
        this.amount = amount;
    }

    void pay(){
        if(amount > 0){
            System.out.println("Payment successful of "+this.amount+"Rs");
        } else {
            System.out.println("Invalid amount!");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        UPIPayment p1 = new UPIPayment(100);

        p1.pay();
    }
}
