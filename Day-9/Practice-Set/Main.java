/* Create interface Vehicle
Method: start()
Create class Bike implementing it */ 

interface Vehicle{
    void start();
}

class Bike implements Vehicle{
    public void start(){
        System.out.print("Starting bike..");
    }
}

public class Main {
    public static void main(String[] args) {
        Bike b1 = new Bike();

        b1.start();
    }    
}
