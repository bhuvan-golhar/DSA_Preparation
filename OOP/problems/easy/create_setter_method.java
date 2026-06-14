// Problem: Create and Use a Setter Method
// Concept: Setter Method
// Time Complexity: O(1)
// Space Complexity: O(1)

class Student {

    String name;

    void setName(String studentName) {
        name = studentName;
    }

    void displayName() {
        System.out.println("Student Name: " + name);
    }
}

public class Solution {

    public static void main(String[] args) {

        Student s1 = new Student();

        s1.setName("Rahul");

        s1.displayName();
    }
}