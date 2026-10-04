# Longest Palindromic Substring

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given a string `s`, return  *the longest*   *palindromic*   *substring*  in `s`.

 

 **Example 1:** 

```
Input: s = "babad"
Output: "bab"
Explanation: "aba" is also a valid answer.

```

 **Example 2:** 

```
Input: s = "cbbd"
Output: "bb"

```

 

 **Constraints:** 

- 1 <= s.length <= 1000
- s consist of only digits and English letters.

## Solution

**Language:** Java  
**Runtime:** 19 ms (beats 40.67%)  
**Memory:** 46.7 MB (beats 32.63%)  
**Submitted:** 2026-10-04T16:06:05.629Z  

```java
class Solution {
    public String longestPalindrome(String s) {
        int n = s.length();
        String res = "";

        for(int i = 0;i<n;i++){
            // Odd length palindrome
            int st = i,end = i;
            while(st>=0&&end<n&&s.charAt(st)==s.charAt(end)){
                st--;
                end++;
            }
            String temp = s.substring(st+1,end);
            if(temp.length()>res.length())res=temp;

            // Even length palindrome
            st = i;
            end = i+1;
            while(st>=0&&end<n&&s.charAt(st)==s.charAt(end)){
                st--;
                end++;
            }
            temp = s.substring(st+1,end);
            if(temp.length()>res.length())res=temp;
        }

        return res;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/longest-palindromic-substring/)