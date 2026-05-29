// Problem: Implement Method Overloading
// Concept: Compile-Time Polymorphism
// Time Complexity: O(1)
// Space Complexity: O(1)

class Calculator {

    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }
}

public class Solution {

    public static void main(String[] args) {

        Calculator calc = new Calculator();

        System.out.println(calc.add(10, 20));
        System.out.println(calc.add(10, 20, 30));
    }
}