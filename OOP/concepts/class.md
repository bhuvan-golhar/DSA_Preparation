# Class

## 📌 Definition

A **class** is a blueprint or template used to create objects, defining their **properties (fields)** and **behavior (methods)**.
In Java, a class serves as a logical structure that groups related data and functions together.

---

## ⚙️ Key Characteristics

* **Blueprint for Objects**: Defines structure for object creation
* **Encapsulates Data & Behavior**: Combines variables and methods
* **Reusable Structure**: Multiple objects can be created from one class
* **Supports Access Modifiers**: Controls visibility of members
* **Defined Using class Keyword**: Basic building block of OOP
* **Stored in Method Area**: Class definitions are loaded once
* **Supports Constructors**: Used for object initialization

---

## 🧱 Class Declaration

```java
class ClassName {
    // fields
    // methods
}
```

---

### Example

```java
class Car {
    String model;
    int speed;

    void drive() {
        System.out.println("Driving");
    }
}
```

---

## 🔍 Creating Objects from Class

```java
Car c1 = new Car();
```

* Object is created using the **new** keyword
* Class acts as a blueprint

---

## 🔁 Class vs Object

| Feature | Class               | Object            |
| ------- | ------------------- | ----------------- |
| Type    | Blueprint           | Instance          |
| Memory  | No memory allocated | Memory allocated  |
| Role    | Defines structure   | Holds actual data |

---

## 🔧 Common Components of a Class

### 1. Fields (Variables)

```java
int speed;
```

---

### 2. Methods (Functions)

```java
void drive() {
    System.out.println("Driving");
}
```

---

### 3. Constructors

```java
Car() {
    speed = 0;
}
```

* Automatically called when object is created

---

## 🔄 Types of Classes (Basic)

### 1. Normal Class

```java
class A {}
```

---

### 2. Static Class (Inner)

```java
static class B {}
```

---

### 3. Final Class

```java
final class C {}
```

* Cannot be inherited

---

## ⚠️ Common Mistakes

### 1. Not Initializing Objects

```java
Car c; // ❌ no object created
```

---

### 2. Confusing Class with Object

* Class defines structure
* Object stores actual data

---

### 3. Accessing Members Without Object

```java
c1.speed // requires object reference
```

---

### 4. Improper Use of Access Modifiers

* May expose or restrict data incorrectly

---

## 🧩 Real-World Usage

Classes are commonly used in:

* Modeling real-world entities (Car, User, Product)
* Designing application structure
* Organizing related data and behavior
* Building reusable components

---

## ⏱️ Performance Considerations

* Class loading happens once
* Object creation depends on usage
* Method calls are generally fast

---

## 📍 When Classes Can Be Problematic

* Poor design can lead to tightly coupled code
* Overuse can make systems complex
* Incorrect abstraction reduces maintainability

---

## 🧠 Memory Representation

* Class definitions are stored in **method area**
* Objects created from class are stored in **heap memory**
* References to objects are stored in **stack memory**

---

## 🎯 Advantages

* Promotes modular design
* Enables code reuse
* Improves readability and maintainability
* Supports object-oriented principles
* Provides structured program organization

---

## ⚠️ Limitations

* Requires proper design planning
* Can increase complexity in small programs
* Misuse may lead to inefficient architecture

---

## 📖 Summary

Classes in Java act as blueprints for creating objects by defining their structure and behavior, and they form the foundation of object-oriented programming by enabling developers to organize code into logical, reusable units; by combining fields, methods, and constructors within a single structure, classes allow efficient modeling of real-world entities while supporting scalability, maintainability, and the implementation of core OOP principles in software development.

---
