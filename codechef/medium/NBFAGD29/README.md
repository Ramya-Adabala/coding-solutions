# NBFAGD29

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Check Luggage Weight Limit

In this example, we will determine whether a passenger’s luggage weight is within the allowed limit. Our goal is to use the  **less than or equal to (`<=`)**  operator to verify if the luggage weight meets the airline's requirement.

 **Steps to follow:** 

- Declare and initialize maxWeight with the value 20 (maximum allowed luggage weight in kg).
- Declare and initialize passengerLuggage with the value 18.
- Compare passengerLuggage with maxWeight using <= and store the result in isAllowed.

 **Expected Output** 

```
Is the luggage within the allowed weight? true

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-23T12:14:06.503Z  

```java
class Codechef {
    public static void main(String[] args) {
        int maxWeight = 20;  // Maximum allowed luggage weight (kg)
        int passengerLuggage = 18; // Passenger's luggage weight

        // Write code to compare and print result in given format
        boolean isAllowed=passengerLuggage<=maxWeight;
        System.out.println("Is the luggage within the allowed weight?"+isAllowed);
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/NBFAGD29)