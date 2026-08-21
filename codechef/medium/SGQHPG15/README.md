# SGQHPG15

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Find the result

What will be the output of the following Java program?

```
class Codechef {
    public static void main(String[] args) {
        int x = 5;
        int y = x++ + ++x - x-- - x;
        System.out.println(y);
   
    }
}

```

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-21T10:45:30.307Z  

```cpp
class Codechef {
    public static void main(String[] args) {
        int remainingAttempts = 3; // Initial attempts count

        // Simulating attempts using post-decrement
        System.out.println("Attempts left: " + remainingAttempts--);
        System.out.println("Attempts left: " + remainingAttempts--);
        System.out.println("Attempts left: " + remainingAttempts--);
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/SGQHPG15)