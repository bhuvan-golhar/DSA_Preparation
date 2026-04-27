# Array Patterns & Techniques

## 📌 Introduction

Understanding arrays goes beyond their structure and behavior; it involves recognizing recurring **patterns and techniques** used to solve problems efficiently. Most array-based problems are built on a limited set of logical approaches, and identifying these patterns helps in writing optimized and clean solutions.

---

## 🔁 Traversal Pattern

The most fundamental pattern where each element of the array is processed sequentially.

```java
for (int i = 0; i < arr.length; i++) {
    // process arr[i]
}
```

### Use Cases

* Finding sum, maximum, minimum
* Printing elements
* Validating conditions

---

## 🔄 Two Pointer Technique

This technique uses two indices to traverse the array, often from different directions.

```java
int left = 0;
int right = arr.length - 1;
```

### Variations

* Opposite direction (start and end)
* Same direction (slow and fast pointers)

### Use Cases

* Reversing an array
* Finding pairs
* Removing duplicates

---

## 🪟 Sliding Window Technique

Maintains a subset (window) of elements and moves it across the array.

```java
int start = 0;

for (int end = 0; end < arr.length; end++) {
    // expand window

    while (condition) {
        // shrink window
        start++;
    }
}
```

### Use Cases

* Subarray problems
* Maximum or minimum sum
* Longest valid segment

---

## 🔍 Searching Techniques

### Linear Search

* Checks each element sequentially
* Works for unsorted arrays

### Binary Search

* Works on sorted arrays
* Divides search space in half

---

## 🔃 Prefix Sum Technique

Used to optimize repeated range sum calculations.

```java
prefix[i] = prefix[i - 1] + arr[i];
```

### Use Cases

* Range queries
* Subarray sum problems

---

## 🔁 In-Place Modification

Modifies the original array without using extra space.

```java
arr[i] = newValue;
```

### Use Cases

* Reversing arrays
* Updating values
* Rearranging elements

---

## ⚖️ Brute Force vs Optimized

### Brute Force

* Simple but inefficient
* Higher time complexity

### Optimized Approach

* Uses patterns like:

  * Two pointers
  * Sliding window
  * Prefix sum

---

## ⚠️ Common Pattern Mistakes

* Not identifying the correct pattern
* Using extra space unnecessarily
* Incorrect pointer movement
* Ignoring edge cases
* Off-by-one loop errors

---

## 📖 Summary

Array problem solving is largely based on recognizing a small set of repeating patterns such as traversal, two pointers, sliding window, and prefix sums, and mastering these approaches allows developers to move from brute force solutions to optimized logic efficiently while improving problem-solving speed, code clarity, and overall algorithmic thinking.

---
