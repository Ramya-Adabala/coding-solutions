# QUOMQD18

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Extracting Year from a Date String

In this example, we demonstrate how to extract the year from a date string using the `substring()` method in Java. This method allows us to retrieve a specific portion of a string based on given indexes.

 **When executed, the code will show:** 

```
Year: 2025  

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-25T14:37:33.073Z  

```java
class Codechef {
    public static void main(String[] args) {
        
        // The string is in the format "YYYY-MM-DD", where YYYY is the year, MM is the month, and DD is the day
        String date = "2025-03-11";

        
        // Use the substring() method to extract characters from index 0 (inclusive) to index 4 (exclusive)
        // This effectively retrieves the first 4 characters of the string, which represent the year
        String year = date.substring(0, 4);

      
        // Display the year to the console for verification or further use
        System.out.println("Year: " + year);
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/QUOMQD18)