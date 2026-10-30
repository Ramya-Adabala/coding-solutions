# stickler-theif-1587115621

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-30T00:46:04.874Z  

```java
class Solution {
    public int findMaxSum(int arr[]) {
        // code here
        int a=0,b=0,temp ;
        for(int n:arr){
            temp=a;
            a=b;
            b=Math.max(n+temp,b);
        }
        return b;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/stickler-theif-1587115621/1)