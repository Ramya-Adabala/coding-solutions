# NDLQGP16

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-27T02:06:07.819Z  

```java
class Codechef {
    public static void main(String[] args) {
        
        String feedback = "   Great product and service! ";
        
        // Trim the original string and store as trimmedFeedback
        String trimmedFeedback = feedback.trim();

        // convert trimmedFeedback to upper case and lower case
        String upperCaseFeedback = trimmedFeedback.toUpperCase();
        String lowerCaseFeedback = trimmedFeedback.toLowerCase();
        
        // output the strings
        System.out.println(upperCaseFeedback);
        System.out.println(lowerCaseFeedback);
        System.out.println(trimmedFeedback.length());

    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/NDLQGP16)