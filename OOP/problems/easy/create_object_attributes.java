// Problem: Create and Use Object Attributes
// Concept: Class Attributes
// Time Complexity: O(1)
// Space Complexity: O(1)

class Student {

    String name;
    int age;

    void displayInfo() {

        System.out.println(
            "Name: " + name +
            ", Age: " + age
        );
    }
}

public class Solution {

    public static void main(String[] args) {

        Student s1 = new Student();

        s1.name = "Rahul";
        s1.age = 21;

        s1.displayInfo();
    }
}