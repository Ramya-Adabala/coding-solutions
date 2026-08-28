# NDLQGP30

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-28T07:19:04.808Z  

```java
class Codechef {
    public static void main(String[] args) {
        
        // Example log entry with multiple delimiters
        String logEntry = "12:30";

        // Use split() with multiple delimiters (Regex: [:;] means split at ':', ';')
        String timestamp =logEntry.split("[:;]")[0]; // Extract first part 
        String minutes = logEntry.split("[:;]")[1];   // Extract second part 

        // Print extracted log components
        System.out.println("Timestamp: " + timestamp);
        System.out.println("Minutes: " + minutes);
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/NDLQGP30)