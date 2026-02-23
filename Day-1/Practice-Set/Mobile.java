// Create a Mobile class with brand and price.
// Create 3 objects.

public class Mobile {
    String brand;
    int price;

    public static void main(String[] args) {
        Mobile m1 = new Mobile();
        Mobile m2 = new Mobile();
        Mobile m3 = new Mobile();

        m1.brand = "Samsung";
        m1.price = 120000;

        m2.brand = "Apple";
        m2.price = 50000;

        m3.brand = "Oppo";
        m3.price = 12000;

        System.out.println("Brand Name: " + m1.brand);
        System.out.println("Price: " + m1.price + "\n");

        System.out.println("Brand Name: " + m2.brand);
        System.out.println("Price: " + m2.price + "\n");

        System.out.println("Brand Name: " + m3.brand);
        System.out.println("Price: " + m3.price + "\n");
    }
}
