/*
Create a Product class

Constructor should take:
productName
price
quantity

Then create 2 objects and print total cost:
total = price * quantity */

public class Product {
    String productName;
    int price;
    int quantity;
    int total;

    Product(String productName, int price, int quantity){
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
        total = price * quantity;
    }

    public static void main(String[] args) {
        
        Product p1 = new Product("ABC", 20, 5);
        Product p2 = new Product("XYZ", 10, 4);

        System.out.println("Product Name: " + p1.productName);
        System.out.println("Price: " + p1.price);
        System.out.println("Quantity: " + p1.quantity);
        System.out.println("Total Price: " + p1.total +"\n");

        System.out.println("Product Name: " + p2.productName);
        System.out.println("Price: " + p2.price);
        System.out.println("Quantity: " + p2.quantity);
        System.out.println("Total Price: " + p2.total);
    }

    
}
