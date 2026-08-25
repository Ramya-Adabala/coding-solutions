# QUOMQD15

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Comparing File Extensions

Write a program to extract and validate the file extension of a given filename.
The program should store a predefined file name, extract its extension using the `substring()` method, and check if it matches `"pdf"` in a  **case-insensitive manner**.

```
String fileName = "Document.PDF";

```

The program should extract the  **file extension**, compare it with `"pdf"` regardless of case, and print whether it is a valid match.

 **Expected Output:** 

```
true

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-25T14:11:46.199Z  

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

[View on CodeChef](https://www.codechef.com/problems/QUOMQD15)