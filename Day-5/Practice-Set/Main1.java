// Create class Employee with private salary.
// Add getter & setter.

class Employee{
    String eName;
    private double salary;

    Employee(String eName){
        this.eName = eName;
        this.salary = 0;
    }

    public void setSalary(double amount){
        if(amount >= 0){
            this.salary = amount;
            System.out.println("Salary updated.");
        } else {
            System.out.println("Salary cannot be negative.");  
        }
        
    }

    public double getSalary(){
        return salary;
    }
}

public class Main1 {

    public static void main(String[] args) {
        Employee e1 = new Employee("Yash");

        System.out.println("Salary before setting: "+e1.getSalary());
        e1.setSalary(10000);
        System.out.println("Salary after setting: "+e1.getSalary());
    }
}
