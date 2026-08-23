# QBKKAM09

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Exam Retake Eligibility

A student is allowed to retake an exam if they either failed the subject or have special approval from the teacher.

```
boolean failedExam = false;
boolean hasApproval = true;

boolean canRetake = failedExam || hasApproval;

```

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-23T12:19:34.541Z  

```cpp
class Codechef {
    public static void main(String[] args) {
        // Step 1: Define a variable to check if it is Saturday
        boolean isSaturday = true;

        // Step 2: Define a variable to check if it is Sunday
        boolean isSunday = false;

        // Step 3: Use the OR operator to determine if it is the weekend
        boolean isWeekend = isSaturday || isSunday;

        // Step 4: Print the result to indicate if it is the weekend
        System.out.println("Is it the weekend? " + isWeekend); // Output: true
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/QBKKAM09)