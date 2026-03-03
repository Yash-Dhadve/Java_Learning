class Animal{
    void makeSound(){
        System.out.println("Animal Sound");
    }
}

class Dog extends Animal{
    void makeSound(){
        System.out.println("Dog barks");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog tommy = new Dog();
        tommy.makeSound();
    }
}
