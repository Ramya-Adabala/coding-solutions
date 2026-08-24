# BKRUQH13

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Evaluating Compound Expressions

In this example, we will evaluate compound arithmetic and logical expressions using Java. The expressions involve integer arithmetic operations and Boolean logic.

When the given code is executed, then the output will be:

```
true

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-24T15:59:26.164Z  

```java
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

[View on CodeChef](https://www.codechef.com/problems/BKRUQH13)