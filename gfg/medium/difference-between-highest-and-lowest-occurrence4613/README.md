# difference-between-highest-and-lowest-occurrence4613

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-25T04:02:12.885Z  

```java
class Solution {
    public int findDiff(int[] arr) {
        // code here
        HashMap<Integer , Integer> map = new HashMap<>();

               for(int i : arr){

                   map.put(i , map.getOrDefault(i , 0) + 1);
               }
               if(map.size() == 1) return 0;

               int minFreq = Integer.MAX_VALUE;
               int maxFreq = Integer.MIN_VALUE;

               for(int freq : map.values()){

                   minFreq = Math.min(minFreq , freq);
                   maxFreq = Math.max(maxFreq , freq);
               }
               return maxFreq - minFreq;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/difference-between-highest-and-lowest-occurrence4613/1)