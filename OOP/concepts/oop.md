# Object-Oriented Programming (OOP)

## 📌 Definition

**Object-Oriented Programming (OOP)** is a programming paradigm based on the concept of **objects**, where each object contains data (fields) and behavior (methods), allowing developers to model real-world entities and relationships in a structured and modular way.

---

## ⚙️ Key Characteristics

* **Object-Based Design**: Programs are built using objects
* **Encapsulation**: Combines data and methods into a single unit
* **Abstraction**: Hides internal implementation details
* **Inheritance**: Enables code reuse through hierarchical relationships
* **Polymorphism**: Allows objects to take multiple forms
* **Modularity**: Breaks complex systems into manageable components
* **Reusability**: Promotes reuse of code across programs
* **Maintainability**: Easier to update and extend code

---

## 🧱 Core Building Blocks

### 1. Class

A blueprint used to create objects.

```java
class Car {
    String model;
}
```

---

### 2. Object

An instance of a class.

```java
Car c1 = new Car();
```

---

### 3. Methods

Define behavior of objects.

```java
void drive() {
    System.out.println("Driving");
}
```

---

### 4. Attributes

Represent data stored in objects.

```java
int speed;
```

---

## 🔹 Four Pillars of OOP

### 1️⃣ Encapsulation

Bundling data and methods together and restricting direct access.

### 2️⃣ Inheritance

Acquiring properties and behavior from another class.

### 3️⃣ Polymorphism

Ability of objects to take multiple forms.

### 4️⃣ Abstraction

Hiding implementation details and exposing only necessary functionality.

---

## 🔁 Real-World Analogy

* **Class** → Blueprint of a car
* **Object** → Actual car instance
* **Attributes** → Color, speed
* **Methods** → Drive, brake

---

## ⏱️ Time Complexity

* Depends on implementation of methods
* Method calls → typically **O(1)**
* Object creation → **O(1)**

---

## 🚀 Space Complexity

* Depends on number of objects → **O(n)**
* Each object occupies heap memory

---

## 🧠 Memory Representation

* Classes are loaded into **method area**
* Objects are stored in **heap memory**
* References are stored in **stack memory**

---

## 🎯 Advantages

* Improves code organization and readability
* Enables modular and reusable design
* Supports scalability and flexibility
* Simplifies complex system modeling
* Encourages real-world problem representation

---

## ⚠️ Limitations

* Can introduce complexity for simple programs
* Requires proper design and planning
* Slight performance overhead compared to procedural code
* Misuse of OOP concepts can lead to tightly coupled code

---

## 📍 When to Use OOP

* When designing large and complex systems
* When modeling real-world entities and relationships
* When code reusability and scalability are required
* When working on applications like software systems, games, and enterprise solutions

---

## 📖 Summary

Object-Oriented Programming is a fundamental programming paradigm that structures programs around objects and their interactions, allowing developers to build modular, reusable, and scalable systems by combining data and behavior into unified entities, and by leveraging core principles such as encapsulation, inheritance, polymorphism, and abstraction, OOP enables efficient modeling of real-world problems while improving code maintainability, readability, and flexibility in modern software development.

---
