# Make Anagram with Removals

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

Given two strings **s1** and  **s2**  in lowercase, the task is to make them anagrams. The only allowed operation is to remove a character from any string.

Find the  **minimum number**  of characters to be deleted to make both the strings anagram.

Two strings are called anagrams of each other if one of them can be converted into another by rearranging its letters.

 **Examples:** 

```
Input: s1 = "bcadeh", s2 = "hea"
Output: 3
Explanation: We need to remove b, c and d from s1. Therefore answer of this test case is 3.

```

```
Input: s1 = "cddgk", s2 = "gcd"
Output: 2
Explanation: We need to remove d and k from s1. Therefore answer of this test case is 2.
```

 **Constraints:** 
1 ≤ |s1|, |s2| ≤ 105

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-27T05:36:07.269Z  

```java
class Solution {
    public int remAnagram(String s1, String s2) {
        // code here
        char a1[]=s1.toCharArray(); Arrays.sort(a1);
        char a2[]=s2.toCharArray();Arrays.sort(a2);
        int m=s1.length();
        int c=0;
        int n=s2.length();
        int i=0,j=0;
        while(i<m && j<n){
            if(a1[i]==a2[j]){
                i++;j++;
            }
            else if(a1[i]<a2[j]) {
                i++;
                c++;
            }
            else{
                j++;c++;
            }
        }
        c+=(m-i)+(n-j);
        return c;
    }
};
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/anagram-of-string/1)