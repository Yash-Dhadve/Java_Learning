// Create an Employee class with name and salary using constructor.

public class Employee {
    String name;
    int salary;

    Employee(String name, int salary){
        this.name = name;
        this.salary = salary;
    }

    public static void main(String[] args) {
        Employee e0 = new Employee("Yash", 10000);

        System.out.println("Name: " + e0.name);
        System.out.println("Salary: " + e0.salary);
    }
}
