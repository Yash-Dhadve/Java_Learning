public class ParameterizedConstructor {
    String name;
    int marks;

    ParameterizedConstructor(String x, int y){
        name = x;
        marks = y;
    }

    public static void main(String[] args) {
        ParameterizedConstructor s0 = new ParameterizedConstructor("Yash", 80);

        System.out.println("Name: " + s0.name);
        System.out.println("Marks: " + s0.marks);
    }
}
