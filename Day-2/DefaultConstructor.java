public class DefaultConstructor {
    String name;
    int marks;

    DefaultConstructor(){
        name = "Unknown";
        marks = 0;
    }

    public static void main(String[] args) {
        DefaultConstructor s0 = new DefaultConstructor();

        System.out.println("Default Name: " + s0.name);
        System.out.println("Default Marks: " + s0.marks);
    }
}
