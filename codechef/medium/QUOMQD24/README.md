# QUOMQD24

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Determining the First Digit in a String

A text-processing system searches for the  **first occurrence**  of a specific character in a string. Complete the program by filling in the missing parts to find the  **index of the first occurrence**  of the digit `'2'` in the given string.

```
String text = "Version 2.0";

```

 **Expected Output:** 

```
The index of '2' is: 8

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-03T10:52:25.624Z  

```java
class Codechef {
    public static void main(String[] args) {
        // Define a string
        String text = "Version 2.0";

        // Find the index of the first occurrence of the digit '2'
 int n=text.indexOf('2');

        // Print the result
        System.out.println("The index of '2' is: " + n);

    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/QUOMQD24)