// Problem: Implement Encapsulation using Getter and Setter
// Concept: Encapsulation
// Time Complexity: O(1)
// Space Complexity: O(1)

class Student {

    private int marks;

    void setMarks(int studentMarks) {
        marks = studentMarks;
    }

    int getMarks() {
        return marks;
    }
}

public class Solution {

    public static void main(String[] args) {

        Student s1 = new Student();

        s1.setMarks(90);

        System.out.println("Student Marks: " + s1.getMarks());
    }
}
