/*
Create class Animal with method makeSound()
Create class Dog extending Animal
Override makeSound()
 */
class Animal{

    String name;
    Animal(String name){
        this.name = name;
    }

    void makeSound(){
        System.out.println("Animal makes sound...");
    }
}

class Dog extends Animal{

    Dog(String name){
        super(name);
    }
    void makeSound(){
        System.out.println("Bow Bow...");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Dog");
        System.out.println("Animal: " + dog.name);
        dog.makeSound();
    }
}
