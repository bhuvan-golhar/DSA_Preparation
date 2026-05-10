// Problem: Create and Use a Class & Object
// Concept: Basic OOP Structure
// Time Complexity: O(1)
// Space Complexity: O(1)

class Student {

    String name;

    void displayName() {
        System.out.println("Student Name: " + name);
    }
}

public class Solution {

    public static void main(String[] args) {

        Student s1 = new Student();

        s1.name = "Rahul";

        s1.displayName();
    }
}
