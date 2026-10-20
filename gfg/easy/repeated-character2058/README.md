# Repeated Character

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given a string  **s** consisting of lowercase English letters, find the first character that repeats in the string.

 **Note:**  If the string contains no repeating characters, return '#'.

 **Examples :** 

```
Input: s = "geeksforgeeks"
Output: g
Explanation: g, e, k and s are the repeating characters. Out of these, g occurs first. 

```

```
Input: s = "abcde"
Output: '#'
Explanation: No repeating character present, so return '#'.

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-20T13:21:12.827Z  

```java
class Solution {
    char firstRep(String S) {
        // your code here
        int n=S.length();
        int freq[]=new int[26];
        for(int i=0;i<n;i++){
            freq[S.charAt(i)-'a']++;
        }
        for(int i=0;i<n;i++){
           if(freq[S.charAt(i)-'a']>1)
           return S.charAt(i);
        }
        return '#';
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/repeated-character2058/1)