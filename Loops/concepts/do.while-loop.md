# do-while Loop

## 📌 Definition

The **do-while loop** is a control flow statement in Java that executes a block of code at least once before checking the condition, and then continues execution as long as the condition evaluates to true.

---

## ⚙️ Key Characteristics

* **Post-Test Loop**: Condition is checked after execution
* **Executes At Least Once**: Runs even if condition is false initially
* **Condition-Based Execution**: Continues while condition is true
* **Useful for Mandatory Execution**: Ideal when loop must run once
* **Simple Structure**: Similar to while loop but with different flow
* **Supports Nesting**: Can be used inside other loops
* **Controlled Iteration**: Requires proper update to avoid infinite loops

---

## 🧱 Syntax

```java
do {
    // code block
} while (condition);
```

---

### Example

```java
int i = 0;

do {
    System.out.println(i);
    i++;
} while (i < 5);
```

---

## 🔍 Execution Flow

1. Loop body executes first
2. Condition is checked
3. If true → loop repeats
4. Continues until condition becomes false

---

## 🔄 Variations

### 1. Executes Once Even If Condition is False

```java
int i = 10;

do {
    System.out.println(i);
} while (i < 5);
```

---

### 2. Infinite do-while Loop

```java
do {
    // runs forever
} while (true);
```

---

## 🔧 Common Operations

### 1. Iteration

```java
int i = 0;

do {
    // process
    i++;
} while (i < n);
```

---

### 2. Input-Based Execution

```java
int input;

do {
    input = scanner.nextInt();
} while (input != -1);
```

---

### 3. Nested do-while Loop

```java
int i = 0;

do {
    int j = 0;
    do {
        // process
        j++;
    } while (j < m);
    i++;
} while (i < n);
```

---

## 🧠 Why do-while Loop Matters

* Ensures execution at least once
* Useful for menus and user input
* Handles scenarios where initial execution is required
* Common in interactive programs

---

## ⚠️ Common Mistakes

### 1. Infinite Loop

```java
do {
    // ❌ missing update
} while (i < 5);
```

---

### 2. Incorrect Condition

* Loop may run more times than expected

---

### 3. Forgetting Semicolon

```java
} while (condition) // ❌ missing ;
```

---

### 4. Improper Update

* Causes incorrect iteration behavior

---

## 🧩 Real-World Usage

do-while loops are commonly used in:

* Menu-driven programs
* User input validation
* Retry mechanisms
* Interactive systems

---

## ⏱️ Performance Considerations

* Time complexity depends on **number of iterations**
* Often O(n) if loop runs n times
* Nested loops increase complexity (O(n²), etc.)
* Ensures at least one execution regardless of condition

---

## 📍 When do-while Loop Can Be Problematic

* May execute unnecessarily once
* Risk of infinite loops if condition not handled
* Less commonly used compared to for/while

---

## 🧠 Memory Representation

* Loop variables stored in **stack memory**
* No additional memory allocation by loop itself
* Space complexity usually constant (O(1))

---

## 🎯 Advantages

* Guarantees at least one execution
* Useful for user-driven logic
* Simple and readable structure
* Good for validation and retry scenarios

---

## ⚠️ Limitations

* May execute unwanted iteration
* Slightly less intuitive than for/while
* Requires careful condition handling

---

## 📖 Summary

The do-while loop in Java is a post-test control structure that ensures a block of code is executed at least once before evaluating the condition, making it particularly useful for scenarios such as user input handling, menu-driven programs, and validation logic, where execution must occur prior to condition checking, and by combining simplicity with guaranteed execution, it provides a reliable approach for handling specific iterative requirements.

---
