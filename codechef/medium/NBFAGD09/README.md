# NBFAGD09

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-31T06:00:49.850Z  

```java
class Codechef {
    public static void main(String[] args) {
        // Total bill amount
        int totalBill = 500;

        // Amount paid by customer
        int amountPaid = 450;

        // Using the Not Equal To (!=) operator in a boolean expression
        boolean isPaymentIncomplete = (amountPaid != totalBill);

        // Printing the result directly
        System.out.println("Payment incomplete: " + isPaymentIncomplete);

        // Another case where the customer pays the full amount
        amountPaid = 500;

        isPaymentIncomplete = (amountPaid != totalBill);
        System.out.println("Payment incomplete: " + isPaymentIncomplete);
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/NBFAGD09)