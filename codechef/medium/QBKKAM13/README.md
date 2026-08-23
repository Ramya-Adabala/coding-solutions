# QBKKAM13

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Door Locked Status

In this example, we demonstrate how to use the Logical NOT (!) operator to check if a door is unlocked by negating its locked status.

 **When executed, the code will show:** 

```
Is the door unlocked? false

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-23T12:21:16.099Z  

```java
class Codechef {
    public static void main(String[] args) {
        // Step 1: Define a boolean variable to indicate if the door is locked
        boolean isDoorLocked = true;

        // Step 2: Use the NOT operator (!) to reverse the value of isDoorLocked
        // This checks if the door is unlocked
        boolean isDoorUnlocked = !isDoorLocked;

        // Step 3: Print the result to indicate whether the door is unlocked
        System.out.println("Is the door unlocked? " + isDoorUnlocked); // Output: false
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/QBKKAM13)