# Count Occurences of Anagrams

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given a word  **pat**  and a text  **txt**. Return the count of the occurrences of anagrams of the word in the text.

 **Example 1:** 

```
Input: txt = "forxxorfxdofr", pat = "for"
Output: 3
Explanation: for, orf and ofr appears in the txt, hence answer is 3.

```

 **Example 2:** 

```
Input: txt = "aabaabaa", pat = "aaba"
Output: 4
Explanation: aaba is present 4 times in txt.

```

 **Constraints:** 
1 <= |pat| <= |txt| <= 105
Both strings contain lowercase English letters.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-27T06:21:27.029Z  

```java
class Solution {
    int search(String pat, String txt) {
        int n = txt.length();  
        int m = pat.length(); 
        if (m > n) return 0;  
        int[] c1 = new int[26];
        int[] c2 = new int[26];
        for (int i = 0; i < m; i++) {
            c2[txt.charAt(i) - 'a']++;
            c1[pat.charAt(i) - 'a']++;  
        }
         int c = 0;
        if (Arrays.equals(c1, c2)) c++; 
     for (int i = m; i < n; i++) {
            
            c2[txt.charAt(i) - 'a']++;
            c2[txt.charAt(i - m) - 'a']--;
            
            if (Arrays.equals(c1, c2)) c++;
        }
        return c;
    }
}

```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/count-occurences-of-anagrams5839/1)