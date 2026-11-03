# check-arithmetic-progression1842

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-03T11:05:30.917Z  

```java
class Solution {
    // Function to check if the given array forms an arithmetic progression
    public boolean checkIsAP(int[] arr) {
        // Your code goes here
        Arrays.sort(arr);

                int initialdiff = 0;
                for(int i = 0; i<(arr.length-1);i++){
                    int diff = arr[i+1] - arr[i];
                        if(i == 0){
                            initialdiff = diff;
                        }
                    if(initialdiff != diff){
                        return false;
                    }
                }
                return true;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/check-arithmetic-progression1842/1)