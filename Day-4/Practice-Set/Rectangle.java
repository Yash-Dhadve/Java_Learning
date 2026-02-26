// Create class Rectangle with method area().

public class Rectangle {
    
    int length;
    int breadth;

    Rectangle(int l, int b){
        length = l;
        breadth = b;
    }

    int area(){
        return length * breadth;
    }

    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(2,3);
        System.out.println("Rectangle area: " + r1.area());
    }
}
