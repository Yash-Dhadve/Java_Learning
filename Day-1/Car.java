class car{

    String brand;
    int speed;

    public static void main(String[] args){
        car car1 = new car();

        car1.brand = "Toyota";
        car1.speed = 120;

        System.out.println("Brand: " + car1.brand);
        System.out.println("Speed: " + car1.speed + " km/h");
    }
}