# QUOMQD09

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Finding a Character at a Specific Position

```
class Codechef {
    public static void main(String[] args) {
        String sample = "Learning";
        System.out.println(sample.charAt(4));
    }
}

```

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-25T14:10:05.933Z  

```cpp
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

[View on CodeChef](https://www.codechef.com/problems/QUOMQD09)