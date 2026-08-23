# QBKKAM08

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Weekend Check

In this example, we demonstrate how to use the logical OR (`||`) operator to determine whether it is the weekend based on the day of the week.

 **When executed, the code will show:** 

```
Is it the weekend? true

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-23T12:19:28.039Z  

```java
class Codechef {
    public static void main(String[] args) {
        // Step 1: Define a variable to check if it is Saturday
        boolean isSaturday = true;

        // Step 2: Define a variable to check if it is Sunday
        boolean isSunday = false;

        // Step 3: Use the OR operator to determine if it is the weekend
        boolean isWeekend = isSaturday || isSunday;

        // Step 4: Print the result to indicate if it is the weekend
        System.out.println("Is it the weekend? " + isWeekend); // Output: true
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/QBKKAM08)