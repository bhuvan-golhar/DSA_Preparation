// Problem: Implement Aggregation
// Concept: Aggregation
// Time Complexity: O(1)
// Space Complexity: O(1)

class Department {

    private String departmentName;

    Department(String departmentName) {
        this.departmentName = departmentName;
    }

    String getDepartmentName() {
        return departmentName;
    }
}

class Employee {

    private String employeeName;
    private Department department;

    Employee(String employeeName, Department department) {
        this.employeeName = employeeName;
        this.department = department;
    }

    void displayInfo() {

        System.out.println(
            "Employee: " + employeeName +
            ", Department: " + department.getDepartmentName()
        );
    }
}

public class Solution {

    public static void main(String[] args) {

        Department dept = new Department("IT");

        Employee emp = new Employee("Rahul", dept);

        emp.displayInfo();
    }
}