# Inheritance

## 📌 Definition

**Inheritance** is an OOP concept where one class (child/subclass) acquires the properties and behavior of another class (parent/superclass), enabling **code reuse** and establishing a hierarchical relationship between classes.

---

## ⚙️ Key Characteristics

* **Code Reusability**: Reuse fields and methods from existing classes
* **IS-A Relationship**: Represents hierarchy (e.g., Dog is an Animal)
* **Method Inheritance**: Child class can use parent methods
* **Extensibility**: Child class can add new features
* **Method Overriding**: Child class can modify inherited behavior
* **Single Inheritance (Java)**: One class can extend only one class
* **Supports Hierarchical Structure**: Multiple subclasses can share a parent

---

## 🧱 Syntax

```java
class Parent {
    // fields and methods
}

class Child extends Parent {
    // additional features
}
```

---

### Example

```java id="inh1"
class Animal {
    void sound() {
        System.out.println("Animal makes sound");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks");
    }
}
```

---

## 🔍 Accessing Inherited Members

```java id="inh2"
Dog d = new Dog();
d.sound(); // inherited method
d.bark();  // own method
```

* Child class can access **public and protected members** of parent

---

## 🔁 Types of Inheritance (Java)

### 1. Single Inheritance

```java id="inh3"
class A {}
class B extends A {}
```

---

### 2. Multilevel Inheritance

```java id="inh4"
class A {}
class B extends A {}
class C extends B {}
```

---

### 3. Hierarchical Inheritance

```java id="inh5"
class A {}
class B extends A {}
class C extends A {}
```

---

> Java does **not support multiple inheritance with classes** (to avoid ambiguity), but it can be achieved using interfaces.

---

## 🔄 Method Overriding

Child class can provide its own implementation of a parent method.

```java id="inh6"
class Animal {
    void sound() {
        System.out.println("Animal sound");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks");
    }
}
```

---

## 🧠 super Keyword

Used to refer to parent class members.

```java id="inh7"
super.sound();
```

* Calls parent method or constructor

---

## ⚠️ Common Mistakes

### 1. Incorrect IS-A Relationship

* Not all relationships should use inheritance

---

### 2. Overusing Inheritance

* Can lead to tightly coupled code

---

### 3. Not Using super Properly

```java id="inh8"
super.method(); // required in some cases
```

---

### 4. Access Modifier Issues

* Private members are not accessible in child class

---

## 🧩 Real-World Usage

Inheritance is commonly used in:

* Modeling hierarchical relationships (Animal → Dog)
* Reusing existing logic across classes
* Framework and library design
* Extending functionality without modifying base code

---

## ⏱️ Performance Considerations

* Method calls remain efficient
* Slight overhead due to inheritance chain
* Overuse can affect maintainability

---

## 📍 When Inheritance Can Be Problematic

* When relationships are not truly hierarchical
* When classes become too dependent on each other
* When deep inheritance chains reduce readability

---

## 🧠 Memory Representation

* Parent class members are inherited by child class
* Objects are stored in **heap memory**
* Method calls resolved using runtime binding (in overriding)

---

## 🎯 Advantages

* Promotes code reuse
* Reduces redundancy
* Supports hierarchical classification
* Improves maintainability
* Enables polymorphism

---

## ⚠️ Limitations

* Tight coupling between classes
* Limited to single inheritance in Java
* Can increase complexity in deep hierarchies
* Misuse can lead to poor design

---

## 📖 Summary

Inheritance in Java enables one class to acquire the properties and behavior of another, allowing developers to build hierarchical relationships and reuse existing code efficiently, and by supporting concepts such as method overriding and the use of the `super` keyword, inheritance provides flexibility in extending and customizing behavior while maintaining a structured design, making it a powerful tool when used appropriately in modeling real-world relationships and scalable application architectures.

---
