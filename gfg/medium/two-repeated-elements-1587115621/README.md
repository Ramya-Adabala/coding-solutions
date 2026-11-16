# two-repeated-elements-1587115621

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-16T11:09:14.070Z  

```java
class Solution {
    public int[] twoRepeated(int[] arr) {
        // code here
        
    int[] a = new int[2];
            int j = 0;
            HashSet<Integer>set = new HashSet<>();
            for(int i = 0;i<arr.length;i++){
                if(set.contains(arr[i])){
                    a[j++] = arr[i];
                }
                else{
                    set.add(arr[i]);
                }
            }

            return a;
}}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/two-repeated-elements-1587115621/1)