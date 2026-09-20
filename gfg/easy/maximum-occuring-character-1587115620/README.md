# Most Frequent Character

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given a string  **s** of lowercase alphabets. The task is to find the maximum occurring character in the string  **s**. If more than one character occurs the maximum number of times then print the lexicographically smaller character.

 **Examples:** 

```
Input: s = "testsample"
Output: 'e'
Explanation: 'e' is the character which is having the highest frequency.
```

```
Input: s = "output"
Output: 't'
Explanation: 't' and 'u' are the characters with the same frequency, but 't' is lexicographically smaller.
```

 **Constraints:** 
1 ≤ |s| ≤ 100

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-20T11:53:56.476Z  

```java
class Solution {
    public char getMaxOccuringChar(String s) {
        // code here
        int[] maxCount = new int[26];

        for(int i=0; i<s.length(); i++){
            maxCount[s.charAt(i)-'a']++;
        }

        int max = Integer.MIN_VALUE;
        char c = '#';
        for(int i=0; i<26; i++){

            if(maxCount[i]>max){
                max =  maxCount[i];
                c = (char) ('a' + i);
            }
        }

        return c;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/maximum-occuring-character-1587115620/1)