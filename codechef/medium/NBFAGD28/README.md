# NBFAGD28

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Worked Example - Check Vehicle Speed

In this task, we will determine whether a vehicle is within the allowed speed limit using the  **Less Than or Equal To (`<=`)**  operator.

 **When this code is executed, the output will be displayed as follows:** 

```
Is the vehicle within the speed limit? true  

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-23T12:12:42.678Z  

```java
class Codechef {
    public static void main(String[] args) {
        int speedLimit = 60;  // Maximum allowed speed
        int vehicleSpeed = 55; // Current vehicle speed

        boolean isWithinLimit = vehicleSpeed <= speedLimit; // Check if within speed limit

        System.out.println("Is the vehicle within the speed limit? " + isWithinLimit);
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/NBFAGD28)