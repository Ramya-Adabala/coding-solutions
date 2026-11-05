# NDLQGP19

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Replacing Special Characters in String Using Java

A text processing system replaces special characters in strings for better readability.

```
String subjectName = "Mathematics@Physics@Chemistry";

```

 **Steps to Complete:** 

- Use the replace() method to replace @ with _.
- Display the desired results.

 **Expected Output:** 

```
Modified subject name: Mathematics_Physics_Chemistry

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-05T05:11:24.855Z  

```java
class Codechef {
    public static void main(String[] args) {
        
        // Define a variable named subjectName and provide it a value.
        String subjectName = "Mathematics@Physics@Chemistry";
        
        // Use replace() method to replace '@' with '_'
        String modifiedSubjectName = subjectName.replace('@','_');

        // Print the desired results
        System.out.println("Modified subject name: " + modifiedSubjectName);
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/NDLQGP19)