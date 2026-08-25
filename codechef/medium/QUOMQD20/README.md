# QUOMQD20

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Extracting a File Name from a Path

A file management system needs to  **extract the file name**  from a given  **file path**. Complete the program by filling in the missing parts to ensure it correctly retrieves the  **file name**  using the `substring()` method.

```
String filePath = "/home/user/documents/file.txt";

```

 **Expected Output:** 

```
File Name: file.txt  

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-25T14:50:05.891Z  

```java
class Codechef {
    public static void main(String[] args) {
        String filePath = "/home/user/documents/file.txt";

        // Extract the file name (substring from index 21 to 29)
        String fileName = filePath.substring(21,29);

        // Print the extracted file name
        System.out.println("File Name: " + fileName);

    }
}


```

---

[View on CodeChef](https://www.codechef.com/problems/QUOMQD20)