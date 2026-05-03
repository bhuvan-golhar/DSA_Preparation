# Polymorphism

## 📌 Definition

**Polymorphism** is an OOP concept that allows objects to take **multiple forms**, enabling the same method or operation to behave differently based on the context, improving flexibility and reusability in programs.

---

## ⚙️ Key Characteristics

* **Multiple Forms**: Same method name, different behavior
* **Method Overloading**: Same method name with different parameters (compile-time)
* **Method Overriding**: Redefining parent method in child class (runtime)
* **Dynamic Behavior**: Method execution decided at runtime
* **Improves Flexibility**: One interface, multiple implementations
* **Supports Code Reusability**: Reduces duplication
* **Enhances Maintainability**: Easier to extend functionality

---

## 🧱 Types of Polymorphism

### 1. Compile-Time Polymorphism (Method Overloading)

```java id="poly1"
class MathOps {
    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }
}
```

* Same method name with different parameters

---

### 2. Runtime Polymorphism (Method Overriding)

```java id="poly2"
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

* Method behavior decided at runtime

---

## 🔍 Method Invocation

```java id="poly3"
Animal a = new Dog();
a.sound();
```

* Calls the **overridden method** of child class
* Demonstrates runtime polymorphism

---

## 🔄 Method Overloading Rules

* Same method name
* Different parameter list
* Return type may vary but not alone

---

## 🔄 Method Overriding Rules

* Same method name and parameters
* Must be in subclass
* Cannot reduce access level
* `@Override` annotation is recommended

---

## 🧠 Dynamic Method Dispatch

* Method call resolved at runtime
* Based on object type, not reference type
* Core mechanism behind runtime polymorphism

---

## ⚠️ Common Mistakes

### 1. Confusing Overloading with Overriding

* Overloading → compile-time
* Overriding → runtime

---

### 2. Incorrect Method Signature

```java id="poly4"
void show(int a)
void show(double a) // valid overloading
```

---

### 3. Missing @Override Annotation

* May lead to unintended behavior

---

### 4. Expecting Runtime Behavior in Overloading

* Overloading is resolved at compile time

---

## 🧩 Real-World Usage

Polymorphism is commonly used in:

* Method design in APIs
* Framework implementations
* Handling different object types uniformly
* Extending behavior in applications

---

## ⏱️ Performance Considerations

* Compile-time polymorphism → faster
* Runtime polymorphism → slight overhead due to dynamic binding
* Improves flexibility with minimal cost

---

## 📍 When Polymorphism Can Be Problematic

* Overuse may reduce code clarity
* Improper overriding can cause unexpected behavior
* Complex hierarchies may become hard to manage

---

## 🧠 Memory Representation

* Method calls resolved via **method table (dynamic binding)**
* Objects stored in **heap memory**
* References stored in **stack memory**

---

## 🎯 Advantages

* Improves code flexibility
* Enables dynamic behavior
* Promotes code reuse
* Simplifies interface design
* Supports extensibility

---

## ⚠️ Limitations

* Slight runtime overhead
* Can increase complexity
* Requires proper understanding of method behavior

---

## 📖 Summary

Polymorphism in Java allows a single interface or method to represent multiple behaviors, enabling both compile-time flexibility through method overloading and runtime adaptability through method overriding, and by leveraging dynamic method dispatch, polymorphism helps developers write more reusable, extensible, and maintainable code while supporting scalable application design where objects can interact seamlessly despite having different underlying implementations.

---
