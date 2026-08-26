# QUOMQD35

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Extracting the Last Word in a Sentence

Write a program to extract and display the last word of a given sentence.
Define a string variable containing a sentence and extract the last word by finding the last space in the string.
Use the `lastIndexOf()` and `substring()` methods to retrieve the last word and print the result.

 **Expected Output:** 

```
The last word is: example.

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-26T09:32:47.095Z  

```java
class Codechef {
    public static void main(String[] args) {
        // Define a string
        String text = "This is a simple example.";

        // Find the last space in the string
                int lastIndexOfSpace=text.lastIndexOf(" ");

        // Extract the last word
    String lastWord=text.substring(lastIndexOfSpace +1);

        // Print the result
System.out.println("The last word is: "+lastWord);
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/QUOMQD35)