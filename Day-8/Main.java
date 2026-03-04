abstract class Shape {
    abstract double area();   // no body
}

class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    double area() {
        return Math.PI * (radius * radius);
    }
}

public class Main{
    public static void main(String[] args) {
        Circle c1 = new Circle(3);

        System.out.println("Area of circle: "+c1.area());
    }
}