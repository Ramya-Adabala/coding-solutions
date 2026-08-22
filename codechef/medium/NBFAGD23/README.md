# NBFAGD23

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Worked Example - Check If the Student Has Passed

In this task, we will determine whether a student has passed an exam using the  **Greater Than or Equal To (`>=`)**  operator.

 **When this code is executed, the output will be displayed as follows:** 

```
Has the student passed? true  

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-22T12:32:12.102Z  

```java
class Codechef {
    public static void main(String[] args) {
        int passingMarks = 40;  // Minimum marks required to pass
        int studentMarks = 45;  // Marks obtained by the student

        boolean hasPassed = studentMarks >= passingMarks; // Store result in variable

        System.out.println("Has the student passed? " + hasPassed);
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/NBFAGD23)