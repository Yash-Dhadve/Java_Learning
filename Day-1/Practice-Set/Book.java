// Create a Book class and print book details.

public class Book {
    String name;
    String description;

    public static void main(String[] args) {
        Book b1 = new Book();

        b1.name = "Java";
        b1.description = "OOP (Object Oriented Programming) is a programming style where everything revolves around objects.";  

        System.out.println("Book Name: " + b1.name);
        System.out.println("Book Description: " + b1.description);

    }
}
