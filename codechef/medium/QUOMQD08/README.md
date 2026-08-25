# QUOMQD08

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Character Type Identifier

In this example, we will extract the initials from a full name using the `charAt()` method in Java. This method helps retrieve specific characters from a string based on their index.

 **When executed, the code will show:** 

```
Initials: JD

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-25T14:09:53.315Z  

```java
class Codechef {
    public static void main(String[] args) {
        
        String fullName = "John Doe";

        
        char firstInitial = fullName.charAt(0); // Retrieves the first character of the string "fullName", which is 'J' in this case

        
        // The position of the first character of "Doe" is manually determined as index 5
        char lastInitial = fullName.charAt(5); // Retrieves the character at index 5, which is 'D'

       
        System.out.println("Initials: " + firstInitial + lastInitial); // Displays "Initials: JD"
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/QUOMQD08)