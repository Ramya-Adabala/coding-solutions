# Longest Substring Without Repeating Characters

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given a string `s`, find the length of the  **longest**   **substring**  without duplicate characters.

 

 **Example 1:** 

```
Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3. Note that "bca" and "cab" are also correct answers.

```

 **Example 2:** 

```
Input: s = "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.

```

 **Example 3:** 

```
Input: s = "pwwkew"
Output: 3
Explanation: The answer is "wke", with the length of 3.
Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.

```

 

 **Constraints:** 

- 0 <= s.length <= 105
- s consists of English letters, digits, symbols and spaces.

## Solution

**Language:** Java  
**Runtime:** 85 ms (beats 10.88%)  
**Memory:** 47.6 MB (beats 81.41%)  
**Submitted:** 2026-09-24T11:47:08.371Z  

```java
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n=s.length();
        int maxi=0;
        Set<Character> ch=new HashSet<>();
        int l=0;
        for(int i=0;i<n;i++){
            if(!ch.contains(s.charAt(i))){
                ch.add(s.charAt(i));
                maxi=Math.max(maxi,i-l+1);
            }
            else{
                while(ch.contains(s.charAt(i))){
                    ch.remove(s.charAt(l));
                    l++;
                }
            }ch.add(s.charAt(i));
        }
        return maxi;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/longest-substring-without-repeating-characters/)