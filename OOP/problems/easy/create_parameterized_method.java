// Problem: Create and Use a Parameterized Method
// Concept: Method Parameters
// Time Complexity: O(1)
// Space Complexity: O(1)

class Student {

    void displayName(String name) {
        System.out.println("Student Name: " + name);
    }
}

public class Solution {

    public static void main(String[] args) {

        Student s1 = new Student();

        s1.displayName("Rahul");
    }
}