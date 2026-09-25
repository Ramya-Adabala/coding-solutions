# find-the-smallest-and-second-smallest-element-in-an-array3226

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-25T09:08:22.216Z  

```java
class Solution {
    public ArrayList<Integer> minAnd2ndMin(int[] arr) {
        // code here
        ArrayList<Integer> list = new ArrayList<>();

        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] < first) {
                second = first;
                first = arr[i];
            } else if(arr[i] < second && arr[i] != first) {
                second = arr[i];
            }
        }

        if(second == Integer.MAX_VALUE) {
            list.add(-1);
        } else {
            list.add(first);
            list.add(second);
        }

        return list;


    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/find-the-smallest-and-second-smallest-element-in-an-array3226/1)