# at-least-two-greater-elements4625

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-24T14:06:25.555Z  

```java
class Solution {
    public ArrayList<Integer> findElements(int[] arr) {
        // code here
        int n=arr.length;
        ArrayList<Integer> al=new ArrayList<>();
        Arrays.sort(arr);
        for(int i=0;i<n-2;i++){
            al.add(arr[i]);
        }
        return al;
    }
};
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/at-least-two-greater-elements4625/1)