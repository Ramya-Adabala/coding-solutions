# Longest Palindrome

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given a string `s` which consists of lowercase or uppercase letters, return the length of the  **longest palindrome**  that can be built with those letters.

Letters are  **case sensitive**, for example, `"Aa"` is not considered a palindrome.

 

 **Example 1:** 

```
Input: s = "abccccdd"
Output: 7
Explanation: One longest palindrome that can be built is "dccaccd", whose length is 7.

```

 **Example 2:** 

```
Input: s = "a"
Output: 1
Explanation: The longest palindrome that can be built is "a", whose length is 1.

```

 

 **Constraints:** 

- 1 <= s.length <= 2000
- s consists of lowercase and/or uppercase English letters only.

## Solution

**Language:** Java  
**Runtime:** 3 ms (beats 64.59%)  
**Memory:** 42.9 MB (beats 84.43%)  
**Submitted:** 2026-09-01T13:08:28.790Z  

```java
class Solution {
    private int getIndex(char ch) {
        return ch >= 'a' && ch <= 'z' ? 
            ch - 'a' : 
            ch - 'A' + 26;
    }

    public int longestPalindrome(String s) {
        boolean[] freq = new boolean[52];

        int n = 0;

        for (int i = 0; i < s.length(); i++) {
            int index = getIndex(s.charAt(i));

            if (freq[index]) {
                freq[index] = false;
                n++;
            } else {
                freq[index] = true;
            }
        }

        return n * 2 == s.length() ? n * 2 : n * 2 + 1;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/longest-palindrome/)