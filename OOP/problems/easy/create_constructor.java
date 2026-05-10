// Problem: Create and Use a Constructor
// Concept: Constructor Initialization
// Time Complexity: O(1)
// Space Complexity: O(1)

class Student {

    String name;

    Student(String studentName) {
        name = studentName;
    }

    void displayName() {
        System.out.println("Student Name: " + name);
    }
}

public class Solution {

    public static void main(String[] args) {

        Student s1 = new Student("Rahul");

        s1.displayName();
    }
}
