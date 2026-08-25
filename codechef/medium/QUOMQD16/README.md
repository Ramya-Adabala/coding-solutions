# QUOMQD16

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-25T14:11:47.292Z  

```java
class Codechef {
    public static void main(String[] args) {
        // Step 1: Define the file name
        String fileName = "Document.PDF";

        // Step 2: Extract the file extension starting from index 9
String fileExtension=fileName.substring(9);

        // Step 3: Compare the extracted file extension with "pdf" in a case-insensitive manner
        System.out.println(fileExtension.equalsIgnoreCase("pdf"));
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/QUOMQD16)