# QBKKAM15

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Passing Grade Check

Write a program to determine if a student did not pass an exam using the Logical NOT (`!`) operator.
The program checks if the student's score is  **below the passing mark**  and displays the result.

 **Steps to Complete** 

- Check if the student scored 50 or more (passing condition).
- Use the Logical NOT (!) operator to determine if the student did NOT pass.
- Print the final result indicating whether the student failed.

 **Expected Output** 

```
Did the student NOT pass? true

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-23T12:23:37.437Z  

```java
class Codechef {
    public static void main(String[] args) {
        // Step 1: Declare and initialize the variable 'marks' to store the student's score
        int marks = 40;

        // Step 2: Use the NOT operator (!) to check if the student did NOT pass
        // The condition (marks >= 50) checks if the marks are 50 or above (passing condition)
        // The NOT operator negates this condition, checking if the student did not pass
         boolean notPass=!(marks>=50);

        // Step 3: Print the result indicating whether the student did NOT pass
 System.out.println("Did the student NOT pass? " + notPass);
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/QBKKAM15)