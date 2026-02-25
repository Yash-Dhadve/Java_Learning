// Create a class Employee with instance variable name and static variable company = "TCS".

public class Employee {
    String name;
    static String company = "TCS";

    public static void main(String[] args) {
        Employee e1 = new Employee();
        Employee e2 = new Employee();

        e1.name = "Yash";
        e2.name = "Lara";

        System.out.println(e1.name + " " + Employee.company);
        System.out.println(e2.name + " " + Employee.company);


    }
}
