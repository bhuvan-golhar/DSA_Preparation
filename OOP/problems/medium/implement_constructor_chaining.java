// Problem: Implement Constructor Chaining
// Concept: Constructor Chaining
// Time Complexity: O(1)
// Space Complexity: O(1)

class Student {

    private String name;
    private int age;

    Student() {
        this("Unknown", 0);
    }

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

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
        Student s2 = new Student("Rahul", 21);

        s1.displayInfo();
        s2.displayInfo();
    }
}