# ceil-the-floor2802

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-25T09:06:50.503Z  

```java
class Solution {
    public int[] getFloorAndCeil(int x, int[] arr) {
        // code here
        int f=-1;
              int c=-1;
              for(int v:arr){
                  if(v<=x && (f==-1||v>f))f=v;
                  if(v>=x && (c==-1||v<c))c=v;

              }
              return new int[]{f,c};

          
    }
}

```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/ceil-the-floor2802/1)