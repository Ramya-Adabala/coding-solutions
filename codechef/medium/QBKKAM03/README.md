# QBKKAM03

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### School Attendance

In this example, we demonstrate how the logical AND (`&&`) operator is used to check if a student has attended both the morning and afternoon classes, ensuring full-day attendance.

When executed, the code will show:

```
Full Day Attendance: true

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-23T12:14:53.462Z  

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

[View on CodeChef](https://www.codechef.com/problems/QBKKAM03)