class Vehicle{
    String brand;

    Vehicle(String brand){
        this.brand = brand;
    }

    void start(){
        System.out.println("Vehical is starting");
    }
}

class Car extends Vehicle{
    Car(String brand){
        super(brand);
    }

    void start(){
        System.out.println("Car is starting");
    }
}

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Toyota");
        System.out.println("Brand: " + car.brand);
        car.start();
    }
}