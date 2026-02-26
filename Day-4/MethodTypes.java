public class MethodTypes {
    void greet() {
        System.out.println("Hello");
    }

    int square(int x) {
        return x * x;
    }

    public static void main(String[] args) {
        MethodTypes d = new MethodTypes();
        d.greet();
        System.out.println(d.square(5));
    }
}
