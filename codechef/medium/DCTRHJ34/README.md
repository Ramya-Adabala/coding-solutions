# DCTRHJ34

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-02T14:18:32.461Z  

```java
class Codechef {
    public static void main(String[] args) {
        // Declaring the correct password and the user input
        String correctPassword = "SecurePass";  // Stored password
        String userInput = "securepass";        // User input

        // Using equalsIgnoreCase to compare both strings ignoring case
        boolean isPasswordCorrect = correctPassword.equalsIgnoreCase(userInput);

        // Printing the result
        System.out.println("Is the password correct? " + isPasswordCorrect);  // Output: true
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/DCTRHJ34)