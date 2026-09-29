# rearrange-an-array-with-o1-extra-space3142

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-29T02:44:12.239Z  

```java
class Solution {
    public void arrange(int[] arr) {
        // code here
        int n=arr.length;
        for(int i=0;i<n;i++){
            arr[i]=arr[i]+(arr[(int)arr[i]]%n)*n;
        }
        for(int i=0;i<n;i++){
            arr[i]=arr[i]/n;        }
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/rearrange-an-array-with-o1-extra-space3142/1)