# Valid Palindrome II

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given a string `s`, return `true`  *if the* `s` *can be palindrome after deleting  **at most one**  character from it*.

 

 **Example 1:** 

```
Input: s = "aba"
Output: true

```

 **Example 2:** 

```
Input: s = "abca"
Output: true
Explanation: You could delete the character 'c'.

```

 **Example 3:** 

```
Input: s = "abc"
Output: false

```

 

 **Constraints:** 

- 1 <= s.length <= 105
- s consists of lowercase English letters.

## Solution

**Language:** Java  
**Runtime:** 4 ms (beats 98.29%)  
**Memory:** 48 MB (beats 13.02%)  
**Submitted:** 2026-09-18T05:31:50.110Z  

```java
class Solution {
    public boolean validPalindrome(String s) {
        int n=s.length();
      int i=0,j=n-1;

        while(i<j){
            if(s.charAt(i)==s.charAt(j)) 
           {
            i++;j--;
           }
           else{
            return isPalindrome(s,i+1,j) || isPalindrome(s,i,j-1);
           }
        }
        return true;
    }
    private boolean isPalindrome(String s, int i, int j){
        while(i<j){
            if(s.charAt(i++)!=s.charAt(j--))
            return false;
        }
        return true;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/valid-palindrome-ii/)