/*
Class: Employee
Method: calculateSalary()

Child Classes:
FullTimeEmployee
PartTimeEmployee

Each must calculate salary differently.

Create parent reference (if possible in language)
Call method and observe runtime behavior.
 */


class Employee{
    double salary;

    Employee(double salary){
        this.salary = salary;
    }

    double calculateSalary(){
        return 0;
    }
}

class FullTimeEmployee extends Employee{
    
    double Bonus;

    FullTimeEmployee(double MonthlySalary, double Bonus){
        super(MonthlySalary);
        this.Bonus = Bonus;
    }

    @Override
    double calculateSalary(){
        return salary+Bonus;
    }
}

class PartTimeEmployee extends Employee{
    
    double HoursWorked;
    double HourlyRate;

    PartTimeEmployee(double HoursWorked, double HourlyRate){
        super(0);
        this.HoursWorked = HoursWorked;
        this.HourlyRate = HourlyRate;
    }

    @Override
    double calculateSalary(){
        return HoursWorked*HourlyRate;
    }
}

public class Main {
    public static void main(String[] args) {
        FullTimeEmployee e1 = new FullTimeEmployee(5000, 500);
        PartTimeEmployee e2 = new PartTimeEmployee(80, 20);

        System.out.println("Salary of employee e1: "+ e1.calculateSalary());
        System.out.println("Salary of employee e2: "+ e2.calculateSalary());
    }
}
