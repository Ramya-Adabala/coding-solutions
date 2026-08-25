# QUOMQD13

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Remove Prefix from a String

In this example, we demonstrate how to remove a prefix from a name using Java’s `substring()` method. This allows us to extract only the relevant portion of the text efficiently.

 **When executed, the code will show:** 

```
Name without prefix: John Smith

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-25T14:10:20.156Z  

```java
class Codechef {
    public static void main(String[] args) {
        
        
        String name = "Mr. John Smith";

        // The substring method extracts the part of the string starting from index 4 (after "Mr. ")
        String cleanName = name.substring(4);

        
        // This will display "John Smith"
        System.out.println("Name without prefix: " + cleanName);
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/QUOMQD13)