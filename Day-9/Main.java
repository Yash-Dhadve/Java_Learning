interface Payments{
    void pay(); //abstract method
}

public class Main{
    public static void main(String[] args) {
        UPI t1 = new UPI();

        t1.pay();
    }
}

class UPI implements Payments{
    public void pay(){
        System.out.print("Payment via UPI");
    }
}



