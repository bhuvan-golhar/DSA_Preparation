// Problem: Implement Runtime Polymorphism
// Concept: Runtime Polymorphism
// Time Complexity: O(1)
// Space Complexity: O(1)

class Animal {

    void sound() {
        System.out.println("Animal makes sound");
    }
}

class Cat extends Animal {

    @Override
    void sound() {
        System.out.println("Cat meows");
    }
}

public class Solution {

    public static void main(String[] args) {

        Animal a = new Cat();

        a.sound();
    }
}