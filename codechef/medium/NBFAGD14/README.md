# NBFAGD14

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Water Boiling Point Detector

In this example, we will check whether water has reached its boiling point based on the given temperature. Our goal is to use the greater than (`>`) operator to determine if the water temperature exceeds the boiling point.

 **Steps to follow:** 

- Declare and initialize BOILING_POINT with the value 100 (Celsius).
- Declare and initialize waterTemperature with the value 105.
- Compare waterTemperature with BOILING_POINT using > and store the result in isBoiling.
- Print the water temperature and boiling point

 **Expected Output** 

```
Water temperature: 105°C
Boiling point: 100°C
Is the water boiling? true

```

Complete the given code and click the "Submit" button to see the output.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-22T12:29:59.619Z  

```java
class Codechef {
    public static void main(String[] args) {
        // Boiling point of water in Celsius
        final int BOILING_POINT = 100;
        
        // Current water temperature (you can change this value to test)
        int waterTemperature = 105;
        
        // Check if water is boiling
        boolean isBoiling =true; // Add your code here
        
        // Print the result
        System.out.println("Water temperature: " + waterTemperature + "°C");
        System.out.println("Boiling point: " + BOILING_POINT + "°C");
        System.out.println("Is the water boiling? " + isBoiling);
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/NBFAGD14)