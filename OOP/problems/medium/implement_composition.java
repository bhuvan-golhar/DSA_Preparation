// Problem: Implement Object Composition
// Concept: Composition (HAS-A Relationship)
// Time Complexity: O(1)
// Space Complexity: O(1)

class Engine {

    void startEngine() {
        System.out.println("Engine starts");
    }
}

class Car {

    Engine engine = new Engine();

    void startCar() {
        engine.startEngine();
        System.out.println("Car is ready to move");
    }
}

public class Solution {

    public static void main(String[] args) {

        Car car = new Car();

        car.startCar();
    }
}