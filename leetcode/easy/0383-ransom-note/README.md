# Ransom Note

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given two strings `ransomNote` and `magazine`, return `true` *if* `ransomNote` *can be constructed by using the letters from* `magazine` *and* `false` *otherwise*.

Each letter in `magazine` can only be used once in `ransomNote`.

 

 **Example 1:** 

```
Input: ransomNote = "a", magazine = "b"
Output: false

```

 **Example 2:** 

```
Input: ransomNote = "aa", magazine = "ab"
Output: false

```

 **Example 3:** 

```
Input: ransomNote = "aa", magazine = "aab"
Output: true

```

 

 **Constraints:** 

- 1 <= ransomNote.length, magazine.length <= 105
- ransomNote and magazine consist of lowercase English letters.

## Solution

**Language:** Java  
**Runtime:** 1 ms (beats 99.95%)  
**Memory:** 46.4 MB (beats 57.50%)  
**Submitted:** 2026-09-01T13:07:18.185Z  

```java
class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int chars[]=new int[26];
        for(char c:magazine.toCharArray()){
            chars[c-'a']++;
        }
        for(char ch:ransomNote.toCharArray()){
            if(chars[ch-'a']==0){
                return false;
            }
            chars[ch-'a']--;
        }
        return true;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/ransom-note/)