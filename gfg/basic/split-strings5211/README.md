# Segregate Different Types of Characters

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

Given a string  **s**  containing letters, digits, and special characters, return an array of three strings [s1, s2, s3] such that:  **s1**  contains all the letters,  **s2**  contains all the digits, and  **s3**  contains all the special characters.

- The relative order of the characters in each string must be exactly as they appear in s.
- If any type of character is not present, then return "-1" in the corresponding string.

 **Examples:** 

```
Input: s = "geeks01for02geeks03!!!"
Output: ["geeksforgeeks", "010203", "!!!"]
Explanation: s1 contains all the letters ("geeksforgeeks"), s2 contains all the digits ("010203"), and s3 contains the remaining special characters ("!!!") 
```

```
Input: s = "**Docoding123456789everyday##"
Output: ["Docodingeveryday", "123456789", "**##"]
Explanation: s1 contains all the letters ("Docodingeveryday"), s2 contains all the digits ("123456789"), and s3 contains all the special characters ("**##") 
```

```
Input: s = "ab##c"
Output: ["abc", "-1", "##"]
```

 **Constraints:** 
1 ≤ s.size() ≤ 105

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-05T10:17:43.956Z  

```java
class Solution {
    public String[] splitString(String s) {
        StringBuilder letters = new StringBuilder();
        StringBuilder digits = new StringBuilder();
        StringBuilder specialChars = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (Character.isLetter(ch)) {
                letters.append(ch);
            } else if (Character.isDigit(ch)) {
                digits.append(ch);
            } else {
                specialChars.append(ch);
            }
        }

        return new String[] {
            letters.toString(), 
            digits.toString(), 
            specialChars.toString()
        };
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/split-strings5211/1)