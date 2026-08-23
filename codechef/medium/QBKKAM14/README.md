# QBKKAM14

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Alarm System Check

A home security system triggers an alarm if the door is not locked.

Given the following Java code:

```
boolean isDoorLocked = true;
boolean alarmTriggered = !isDoorLocked;

```

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-23T12:21:23.580Z  

```cpp
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

[View on CodeChef](https://www.codechef.com/problems/QBKKAM14)