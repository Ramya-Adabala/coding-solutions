# BKRUQH05

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Find the output

Given the values a = 20, b = 5, c = 3, and d = 7, what will be the output of the following expression in Java?

```
int result = a / b * c + d - a % c;
System.out.println(result);

```

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-23T12:25:18.499Z  

```cpp
class Codechef {
    public static void main(String[] args) {
        // Define variables
        int a = 10, b = 5, c = 2;
        boolean result;

        // Expression with different operators
        int calculation = a + b * c - 4 / 2; // Multiplication and division have higher precedence

        // Logical and relational operators combined
        result = a > b && b < c || a + c < b * 2; 
        // '&&' has higher precedence than '||', so it executes first

        // Print results
        System.out.println(calculation); // Expected output: 18
        System.out.println(result); // Expected output: true
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/BKRUQH05)