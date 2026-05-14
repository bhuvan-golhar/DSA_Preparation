// Problem: Implement Abstraction using Abstract Class
// Concept: Abstraction
// Time Complexity: O(1)
// Space Complexity: O(1)

abstract class Animal {

    abstract void makeSound();
}

class Cat extends Animal {

    @Override
    void makeSound() {
        System.out.println("Cat meows");
    }
}

public class Solution {

    public static void main(String[] args) {

        Cat c1 = new Cat();

        c1.makeSound();
    }
}