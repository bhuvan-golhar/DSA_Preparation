// Problem: Design Employee Management System
// Concept: Interface with Runtime Polymorphism
// Time Complexity: O(1)
// Space Complexity: O(1)

interface Employee {

    void calculateSalary();

    void displayRole();
}

class FullTimeEmployee implements Employee {

    private int monthlySalary;

    FullTimeEmployee(int monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    @Override
    public void calculateSalary() {
        System.out.println("Full Time Salary: " + monthlySalary);
    }

    @Override
    public void displayRole() {
        System.out.println("Role: Full Time Employee");
    }
}

class PartTimeEmployee implements Employee {

    private int hoursWorked;
    private int hourlyRate;

    PartTimeEmployee(int hoursWorked, int hourlyRate) {
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    @Override
    public void calculateSalary() {

        int salary = hoursWorked * hourlyRate;

        System.out.println("Part Time Salary: " + salary);
    }

    @Override
    public void displayRole() {
        System.out.println("Role: Part Time Employee");
    }
}

public class Solution {

    public static void main(String[] args) {

        Employee emp1 = new FullTimeEmployee(50000);
        Employee emp2 = new PartTimeEmployee(5, 500);

        emp1.displayRole();
        emp1.calculateSalary();

        emp2.displayRole();
        emp2.calculateSalary();
    }
}