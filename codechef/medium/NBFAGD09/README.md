# NBFAGD09

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Check Employee Attendance Status

In this example, we will work with integer variables to determine whether an employee has attended all working days in a month. Our goal is to use the Not Equal To (`!=`) operator to check if the attendance is incomplete.

 **Steps to follow:** 

- Declare and initialize totalWorkingDays with the value 22.
- Declare and initialize daysAttended with the value 20.
- Use the != operator to compare daysAttended with totalWorkingDays and store the result in isAttendanceIncomplete.

 **Expected Output** 

```
Attendance incomplete: true

```

Complete the given code and click the "Submit" button to see the output.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-22T12:28:00.037Z  

```java
class Codechef {
    public static void main(String[] args) {
        // Total working days in a month
        int totalWorkingDays = 22;

        // Days attended by an employee
        int daysAttended = 20;

        // Complete the comparision
        boolean isAttendanceIncomplete = true;

        // Printing the result directly
        System.out.println("Attendance incomplete: " + isAttendanceIncomplete);

    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/NBFAGD09)