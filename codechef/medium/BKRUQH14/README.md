# BKRUQH14

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Find the output

What will be the output of the following Java code?

```
class Codechef {
    public static void main(String[] args) {
        int a = 5, b = 10, c = 2;  
        int result = a++  *--b / c + b % c - --a*  c;  
        System.out.println(result);
    }
}

```

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-24T16:02:28.932Z  

```cpp
class Codechef {
    public static void main(String[] args) {
        // Define variables
        int a = 12, b = 4, c = 2;
        boolean result;

        // Compound logical and relational expression
        result = (a > b) && (b < c) || (a % c == 0); 
        // Evaluates as: (true && false) || true ? false || true ? true

        // Print results
        System.out.println(result); // Output: true
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/BKRUQH14)