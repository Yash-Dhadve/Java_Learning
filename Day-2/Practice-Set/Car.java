// Create a Car class with brand and price.
// Create 2 objects with different data.

class Car {
   String brand;
   int price;

   Car() {
    brand = "Unknown";
    price = 0;
   }

   public static void main(String[] var0) {
      Car var1 = new Car();
      var1.brand = "Toyota";
      var1.price = 4000000;

      Car var2 = new Car();
      var2.brand = "BMW";
      var2.price = 5000000;

      System.out.println("Brand: " + var1.brand);
      System.out.println("Price: " + var1.price + " Rs\n");

      System.out.println("Brand: " + var2.brand);
      System.out.println("Price: " + var2.price + " Rs\n");
   }
}