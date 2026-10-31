# NBFAGD04

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-31T05:59:49.853Z  

```java
class Codechef {
    public static void main(String[] args) {
        // Comparing Account Numbers (primitive comparison)
        int accountNumber1 = 12345;
        int accountNumber2 = 12345;

        System.out.println("Is accountNumber1 equal to accountNumber2? " + (accountNumber1 == accountNumber2)); // true
        
        // Comparing Transaction Messages
        String transactionMsg1 = "Payment Successful";
        String transactionMsg2 = "Payment Successful";

        System.out.println("Is transactionMsg1 equal to transactionMsg2? " + (transactionMsg1 == transactionMsg2)); // true (string literals are interned)
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/NBFAGD04)