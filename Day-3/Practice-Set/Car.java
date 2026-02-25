// Create a class Car with static variable totalCars.
// Increase count in constructor.

public class Car {
    static int totalCars = 0;

    Car(){
        totalCars++;
    }

    public static void main(String[] args) {
        Car c1 = new Car();
        Car c2 = new Car();
        Car c3 = new Car();
        Car c4 = new Car();

        System.out.println("Total Cars: " + Car.totalCars);
    }
}
