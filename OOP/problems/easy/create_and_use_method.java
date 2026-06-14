// Problem: Create and Use a Method
// Concept: Class Method
// Time Complexity: O(1)
// Space Complexity: O(1)

class Student {

    void study() {
        System.out.println("Student is studying");
    }
}

public class Solution {

    public static void main(String[] args) {

        Student s1 = new Student();

        s1.study();
    }
}