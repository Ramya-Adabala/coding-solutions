# First Occurence

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

Given two strings  **txt**  and  **pat**, return the 0-based index of the first occurrence of the substring  **pat**  in  **txt**. If pat is not found, return -1.
 **Note:** You are not allowed to use the inbuilt function.

 **Examples :** 

```
Input: txt = "GeeksForGeeks", pat = "Fr"
Output: -1
Explanation: "Fr" is not present in the string "GeeksForGeeks" as substring.
```

```
Input: txt = "GeeksForGeeks", pat = "For"
Output: 5
Explanation: "For" is present as substring in "GeeksForGeeks" from index 5 (0 based indexing).

```

```
Input: txt = "GeeksForGeeks", pat = "gr"
Output: -1
Explanation: "gr" is not present in the string "GeeksForGeeks" as substring.
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-13T11:15:33.857Z  

```java
class Solution {
    int firstOccurence(String txt, String pat) {
        // code here
        return txt.indexOf(pat);
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/implement-strstr/1)