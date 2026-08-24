# BKRUQH15

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Find the output

Given the values p = 9, q = 4, r = 7, and s = 5, what will be the output of the following expression in Java?

```
int result = p + q  *r / s - q % r + p*  (q / s);
System.out.println(result);

```

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-24T16:02:58.183Z  

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

[View on CodeChef](https://www.codechef.com/problems/BKRUQH15)