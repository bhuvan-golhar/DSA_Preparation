// Problem: Implement Static Members
// Concept: Static Variable and Static Method
// Time Complexity: O(1)
// Space Complexity: O(1)

class Student {

    static String college = "ABC College";

    private String name;

    Student(String name) {
        this.name = name;
    }

    void displayInfo() {

        System.out.println(
            "Name: " + name +
            ", College: " + college
        );
    }

    static void displayCollege() {
        System.out.println("College: " + college);
    }
}

public class Solution {

    public static void main(String[] args) {

        Student s1 = new Student("Rahul");
        Student s2 = new Student("Aman");

        s1.displayInfo();
        s2.displayInfo();

        Student.displayCollege();
    }
}