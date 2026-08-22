# NBFAGD13

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Worked Example - Check If a Car Is Over Speeding

In this task, we will determine if a car is exceeding the speed limit using the Greater Than (`>`) operator.

 **When this code is executed, the output will be displayed as follows:** 

```
Over speed? true

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-22T12:28:28.728Z  

```java
class Codechef{
    public static void main(String[] args) {
        int speedLimit = 60;  // Speed limit in km/h
        int carSpeed = 70;    // Current speed of the car

        System.out.println("Over speed? " + (carSpeed > speedLimit));
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/NBFAGD13)