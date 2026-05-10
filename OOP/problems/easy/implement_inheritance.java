// Problem: Implement Inheritance using Parent and Child Class
// Concept: Inheritance
// Time Complexity: O(1)
// Space Complexity: O(1)

class Animal {

    void sound() {
        System.out.println("Animal makes sound");
    }
}

class Cat extends Animal {

    void meow() {
        System.out.println("Cat meows");
    }
}

public class Solution {

    public static void main(String[] args) {

        Cat c1 = new Cat();

        c1.sound();
        c1.meow();
    }
}
