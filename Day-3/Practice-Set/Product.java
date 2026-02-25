// Create 5 objects and print total count.

public class Product {
    static int count = 0;

    Product(){
        count++;
    }

    public static void main(String[] args) {
        Product p1 = new Product();
        Product p2 = new Product();
        Product p3 = new Product();
        Product p4 = new Product();
        Product p5 = new Product();

        System.out.println("Total Products: " + Product.count);
    }
}
