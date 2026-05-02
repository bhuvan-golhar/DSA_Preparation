# Encapsulation

## 📌 Definition

**Encapsulation** is an OOP concept that involves bundling data (fields) and methods (functions) into a single unit (class) while restricting direct access to the data, ensuring controlled interaction through defined methods.

---

## ⚙️ Key Characteristics

* **Data Hiding**: Restricts direct access to variables
* **Controlled Access**: Uses methods (getters/setters) to interact with data
* **Improved Security**: Prevents unauthorized modification
* **Encapsulated Unit**: Combines data and behavior in a class
* **Use of Access Modifiers**: private, protected, public
* **Maintains Data Integrity**: Validates data before modification
* **Improves Maintainability**: Changes can be made internally without affecting external code

---

## 🧱 Basic Structure

```java id="enc1"
class ClassName {
    private int data;

    public void setData(int value) {
        data = value;
    }

    public int getData() {
        return data;
    }
}
```

---

### Example

```java id="enc2"
class Student {
    private int marks;

    public void setMarks(int m) {
        if (m >= 0) {
            marks = m;
        }
    }

    public int getMarks() {
        return marks;
    }
}
```

---

## 🔍 Accessing Encapsulated Data

```java id="enc3"
Student s = new Student();
s.setMarks(90);
System.out.println(s.getMarks());
```

* Data is accessed through **methods only**, not directly

---

## 🔄 Access Modifiers

| Modifier  | Access Level              |
| --------- | ------------------------- |
| private   | Within same class only    |
| protected | Same package + subclasses |
| public    | Accessible everywhere     |

---

## 🔧 Common Operations

### 1. Setting Values

```java id="enc4"
obj.setData(value);
```

---

### 2. Getting Values

```java id="enc5"
obj.getData();
```

---

### 3. Data Validation

```java id="enc6"
if (value > 0) {
    data = value;
}
```

---

## 🧠 Why Encapsulation Matters

* Protects data from unintended changes
* Ensures controlled data access
* Helps maintain consistency and correctness
* Makes code easier to debug and maintain

---

## ⚠️ Common Mistakes

### 1. Making Fields Public

```java id="enc7"
public int data; // ❌ breaks encapsulation
```

---

### 2. No Validation in Setters

* Allows invalid data to be assigned

---

### 3. Overusing Getters/Setters

* May expose unnecessary details

---

### 4. Ignoring Access Modifiers

* Reduces control over data security

---

## 🧩 Real-World Usage

Encapsulation is commonly used in:

* Banking systems (protect account balance)
* User data handling (restrict sensitive data)
* APIs and libraries
* Large-scale application design

---

## ⏱️ Performance Considerations

* Slight overhead due to method calls
* Improves long-term maintainability and safety
* Minimal impact compared to benefits

---

## 📍 When Encapsulation Can Be Problematic

* Overuse can make code verbose
* Poor design may hide necessary data
* Excessive abstraction may reduce clarity

---

## 🧠 Memory Representation

* Data members stored in **heap (inside object)**
* Methods stored in **method area**
* Access controlled via method calls

---

## 🎯 Advantages

* Protects data integrity
* Improves code security
* Enhances maintainability
* Supports modular design
* Provides controlled access

---

## ⚠️ Limitations

* Adds extra code (getters/setters)
* Can reduce direct accessibility
* Slight performance overhead

---

## 📖 Summary

Encapsulation in Java ensures that data and the methods operating on that data are bundled together within a class while restricting direct access to internal variables, allowing controlled interaction through well-defined methods; by using access modifiers and validation logic, encapsulation helps protect data integrity, improves security, and enhances maintainability, making it a fundamental principle for building robust, scalable, and well-structured object-oriented applications.

---
