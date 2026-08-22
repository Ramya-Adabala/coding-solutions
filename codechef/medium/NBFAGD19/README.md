# NBFAGD19

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Check if Battery is Low

In this example, we will check whether a device's battery level is below a defined threshold.
Our goal is to use the  **less than (`<`)**  operator to determine if the battery is low.

 **Steps to follow:** 

- Declare and initialize lowBatteryLevel with the value 20 (minimum battery level).
- Declare and initialize currentBattery with the value 15.
- Compare currentBattery with lowBatteryLevel using < and store the result in isBatteryLow.
- Print the result in the format as per the expected output below

 **Expected Output** 

```
Battery low? true

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-22T12:31:30.108Z  

```java
class Codechef {
    public static void main(String[] args) {
        int lowBatteryLevel = 20;  // Minimum battery level
        int currentBattery = 15;   // Current battery percentage
        
        boolean isBatterLow = true; // Add code here to compare
        
        // Write statement to print the result
        System.out.println("Battery low?"+ isBatterLow);
        
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/NBFAGD19)