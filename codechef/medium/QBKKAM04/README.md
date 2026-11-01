# QBKKAM04

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-01T06:11:21.239Z  

```java
class Codechef {
    public static void main(String[] args) {
        // Step 1: Check attendance for the morning class
        boolean attendedMorningClass = true;

        // Step 2: Check attendance for the afternoon class
        boolean attendedAfternoonClass = true;

        // Step 3: Combine attendance checks for both classes using the AND operator
        boolean fullDayAttendance = attendedMorningClass && attendedAfternoonClass;

        // Step 4: Print whether the person attended the full day
        System.out.println("Full Day Attendance: " + fullDayAttendance); // Output: true
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/QBKKAM04)