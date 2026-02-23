/* Create a Student class with name and marks.
Create 2 objects and print details. */

public class Student {
    String name;
    int marks;

    public static void main(String[] args){
        Student s1 = new Student();
        Student s2 = new Student();

        s1.name = "Yash";
        s1.marks = 80;

        s2.name = "Lara";
        s2.marks = 75;

        System.out.println("Student Name: " + s1.name);
        System.out.println("Marks: " + s1.marks + "\n");

        System.out.println("Student Name: " + s2.name);
        System.out.println("Marks: " + s2.marks + "\n");
    }
}
