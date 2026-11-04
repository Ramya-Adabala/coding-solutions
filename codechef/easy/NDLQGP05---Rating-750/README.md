# NDLQGP05 - Rating 750

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

### Test what you have studied

You are given  **two strings**  in the IDE. Your task is to:

- Convert both strings to uppercase.
- Concatenate the two strings with a single space between them.
- Print the length of the final concatenated string.
- Print the final concatenated string.

 **Expected Output** 

```
11
HELLO WORLD

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-04T05:06:18.902Z  

```java
class Codechef {
    public static void main(String[] args) {
        
        String s1="Hello";
        String s2="World";
        
        // Converting both strings to uppercase
        s1 = s1.toUpperCase();
        s2 = s2.toUpperCase();

        // Concatenating with a space in between
        String finalString = s1 + " " + s2;

        // Printing the length of the final string
        System.out.println(finalString.length());

        // Printing the final string
        System.out.println(finalString);
        
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/NDLQGP05)