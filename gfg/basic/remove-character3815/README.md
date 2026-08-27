# Remove character

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

Given two strings str1 and str2, remove those characters from the first string(str1) which are present in the second string(str2). Both the strings are different and contain only lowercase characters.
 **NOTE:** Size of the first string is always greater than the size of the second string(|str1| > |str2|).
 

 **Example 1:** 

```
Input: str1 = "computer", str2= "cat"
Output: "ompuer"
Explanation: After removing characters(c, a, t) from string1 we get "ompuer".
```

 **Example 2:** 

```
Input: str1 = "occurrence", str2 = "car"
Output: "ouene"
Explanation: After removing characters (c, a, r) from string1 we get "ouene".
```

 **Constraints:** 
1 <= |Str1|, |Str2| <= 50

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-27T05:39:56.411Z  

```java
class Solution {
    static String removeChars(String str1, String str2) {
        // code here
        String res="";
        for(char ch:str1.toCharArray()){
            if(! str2.contains(String.valueOf(ch))){
                res+=ch;
        }}
        return res;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/remove-character3815/1)