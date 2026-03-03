/*
Create class Shape with method area()
Create child classes Circle and Rectangle
Override area() method.
 */

class Shape{
    double area(){
        return 0;
    }
}

class Circle extends Shape{
    double radius;

    Circle(double radius){
        this.radius = radius;
    }

    @Override
    double area(){
        return 3.14*(radius*radius);
    }
}

class Rectangle extends Shape{
    double width, height;

    Rectangle(double width, double height){
        this.width = width;
        this.height = height;
    }

    @Override
    double area(){
        return width*height;
    }
}

public class Main {
    public static void main(String[] args) {
        Circle c1 = new Circle(3);
        Rectangle r1 = new Rectangle(2,3);

        System.out.println("Area of circle: "+ c1.area());
        System.out.println("Area of rectangle: "+ r1.area());
    }   
}
