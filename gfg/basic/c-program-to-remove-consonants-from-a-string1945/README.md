# Remove Consonants

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

Given a string  **s**, remove all consonants and return the modified string containing only vowels.

If the string does not contain any vowels, return an empty string.

 **Examples:** 

```
Input: s = "abEkipo"
Output: "aEio"
Explanation: a, E, i, o are only vowels in the string.

```

```
Input: s = "rrty"
Output: ""
Explanation: There are no vowels.

```

 **Constraints** 
1 ≤ n ≤ 105, n is length of the string
The string should consist of only alphabets.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-18T14:26:36.362Z  

```java
// User function Template for Java

class Solution {
    public String remConsonants(String s) {
        // code here.
        char c;
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
          c=s.charAt(i);
if(c=='A'||c=='E'||c=='I'||c=='O'||c=='U'||c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
        {  
        sb.append(c);
    }}
  
    return sb.toString();
    
}}

```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/c-program-to-remove-consonants-from-a-string1945/1)