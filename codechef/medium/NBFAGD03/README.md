# NBFAGD03

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Worked Example - Compare Bank Details

In this example, we demonstrate how to compare two values using `==`.

 **When executed, the code will show:** 

```
Is accountNumber1 equal to accountNumber2? true
Is transactionMsg1 equal to transactionMsg2? true

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-22T12:25:40.669Z  

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

[View on CodeChef](https://www.codechef.com/problems/NBFAGD03)