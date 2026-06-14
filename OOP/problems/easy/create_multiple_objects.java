// Problem: Create and Use Multiple Objects
// Concept: Object Instantiation
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
        Student s2 = new Student();

        s1.name = "Rahul";
        s2.name = "Aman";

        s1.displayName();
        s2.displayName();
    }
}