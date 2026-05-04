# while Loop

## 📌 Definition

The **while loop** is a control flow statement in Java that repeatedly executes a block of code as long as a specified condition evaluates to true, making it suitable when the number of iterations is not known beforehand.

---

## ⚙️ Key Characteristics

* **Condition-Based Execution**: Runs as long as condition is true
* **Unknown Iteration Count**: Used when number of iterations is not predetermined
* **Pre-Test Loop**: Condition is checked before execution
* **Flexible Usage**: Can be used for dynamic and runtime-driven scenarios
* **Simple Syntax**: Easier to use when only condition matters
* **Supports Nested Loops**: Can be placed inside other loops
* **Risk of Infinite Loop**: Requires careful condition and update

---

## 🧱 Syntax

```java id="n4d8kz"
while (condition) {
    // code block
}
```

---

### Example

```java id="y2kq7p"
int i = 0;

while (i < 5) {
    System.out.println(i);
    i++;
}
```

---

## 🔍 Execution Flow

1. Condition is checked
2. If true → loop body executes
3. Update statement inside loop runs
4. Steps 1–3 repeat until condition becomes false

---

## 🔄 Variations

### 1. Infinite while Loop

```java id="3x8fje"
while (true) {
    // runs forever
}
```

---

### 2. Condition-Based Loop

```java id="m6q2ut"
while (input != -1) {
    // process input
}
```

---

## 🔧 Common Operations

### 1. Iteration

```java id="c9z8kw"
int i = 0;
while (i < n) {
    // process
    i++;
}
```

---

### 2. Traversing Data

```java id="q7t2lm"
int i = 0;
while (i < arr.length) {
    System.out.println(arr[i]);
    i++;
}
```

---

### 3. Nested while Loop

```java id="8j3kdl"
int i = 0;

while (i < n) {
    int j = 0;
    while (j < m) {
        // process
        j++;
    }
    i++;
}
```

---

## 🧠 Why while Loop Matters

* Useful when iteration count is not known
* Handles dynamic conditions effectively
* Widely used in input-driven programs
* Important for real-time and event-based logic

---

## ⚠️ Common Mistakes

### 1. Infinite Loop

```java id="p9v2xr"
while (i < 5) {
    // ❌ missing update
}
```

---

### 2. Incorrect Condition

* Loop may not execute or may run forever

---

### 3. Update Inside Loop Missing or Wrong

* Causes incorrect execution behavior

---

### 4. Off-by-One Errors

* Incorrect loop boundaries

---

## 🧩 Real-World Usage

while loops are commonly used in:

* Reading user input until condition is met
* Processing streams or data until termination
* Game loops and simulations
* Event-driven systems

---

## ⏱️ Performance Considerations

* Time complexity depends on **number of iterations**
* Often O(n) if loop runs n times
* Nested while loops increase complexity (O(n²), etc.)
* Efficiency depends on condition and update logic

---

## 📍 When while Loop Can Be Problematic

* Poor condition can cause infinite loops
* Harder to track iterations compared to for loop
* Complex conditions reduce readability

---

## 🧠 Memory Representation

* Loop variable stored in **stack memory**
* No additional memory allocation by loop itself
* Space complexity usually constant (O(1))

---

## 🎯 Advantages

* Ideal for unknown iteration counts
* Simple and flexible structure
* Useful for dynamic conditions
* Easy to implement input-based logic

---

## ⚠️ Limitations

* Risk of infinite loops
* Less structured than for loop
* Harder to debug in complex conditions

---

## 📖 Summary

The while loop in Java provides a flexible and condition-driven approach to executing repeated operations when the number of iterations is not known in advance, and by evaluating the condition before each execution, it ensures controlled looping behavior while supporting dynamic and real-time scenarios, making it a fundamental tool for handling input-driven logic, iterative processing, and situations where execution depends on runtime conditions.

---
