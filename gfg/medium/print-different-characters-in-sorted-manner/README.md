# print-different-characters-in-sorted-manner

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-26T01:26:36.817Z  

```java
class Solution {
    public String sortedDistinct(String s) {
        // code here
        int arr[]=new int[26];
        for(char c:s.toCharArray()){
            arr[c-'a']=1;
        }
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<26;i++){
            if(arr[i]==1) sb.append((char)('a'+i));
        }
        return sb.toString();
    }
}

```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/print-different-characters-in-sorted-manner/1)