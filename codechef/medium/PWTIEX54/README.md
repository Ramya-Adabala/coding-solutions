# PWTIEX54

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Fill in the blanks - Static Members Usage

Complete the missing parts in the code that demonstrates the usage of static variables, methods, and blocks in Java. You need to fill in the blanks to initialize the static variable, implement the static block to modify the static variable, and correctly call the static method in the `main` method.

 **Expected Output:** 

```
Count: 11

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-08T01:08:28.066Z  

```java
class Codechef {
    // Static variable
    static int count = 0;  // Initialize count to 0

    // Static method
    public static void increment() {
        count++;  // Static method to increment the count
    }

    // Static block
    static {
        count=10;  // Initialize count to 10
    }

    public static void main(String[] args) {
        // Calling the static method
        Codechef.increment();  // Fill in the missing method call code to increment count
        
        // Printing the static variable
        System.out.println("Count: " + count);
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/PWTIEX54)