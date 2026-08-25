# QUOMQD14

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Extracting a substring

What will be the output of the following code?

```
class Codechef {
    public static void main(String[] args) {
        String word = "Programming";
        System.out.println(word.substring(3));
    }
}

```

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-25T14:10:34.958Z  

```cpp
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

[View on CodeChef](https://www.codechef.com/problems/QUOMQD14)