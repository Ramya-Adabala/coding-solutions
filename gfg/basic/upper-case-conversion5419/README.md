# Capitalize First Letter of Words

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

Given a string  **s**, convert the first letter of each word in the string to uppercase. 

 **Examples:** 

```
Input: s = "gEEKs"
Output: "GEEKs"

```

```
Input: s = "i love programming"
Output: "I Love Programming"

```

 **Constraints:** 
1 <= s.length() <= 104
Consists of lowercase alphabets and spaces to separate words

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-30T09:47:40.306Z  

```java
class Solution {
    public String convert(String s) {
        // code here
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if((i==0) ||s.charAt(i-1)==' '){
                sb.append(Character.toUpperCase(ch));
            }
            else{
                sb.append(ch);
            }
        }
        return sb.toString();
    }
};
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/upper-case-conversion5419/1)