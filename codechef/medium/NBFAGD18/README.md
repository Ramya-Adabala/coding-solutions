# NBFAGD18

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Worked Example - Check the Temperature

In this task, we will determine if the current temperature is below the minimum safe temperature using the Less Than (`<`) operator.

 **When this code is executed, the output will be displayed as follows:** 

```
Is temperature too low? true

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-22T12:30:17.818Z  

```java
class Codechef {
    public static void main(String[] args) {
        int minTemperature = 10;  // Minimum safe temperature
        int currentTemperature = 5; // Current temperature

        System.out.println("Is temperature too low? " + (currentTemperature < minTemperature));
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/NBFAGD18)