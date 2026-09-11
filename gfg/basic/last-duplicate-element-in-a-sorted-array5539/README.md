# Last Duplicate in a Sorted Array

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

You are given a sorted array  **arr[]** that may contain duplicate elements. Your task is to find the index of the last occurrence of any duplicate element and return the  **index**  along with the  **value**  of that element. If no duplicate element is found, return  **[-1, -1]**.

 **Examples :** 

```
Input: arr[] = [1, 5, 5, 6, 6, 7]
Output: [4, 6]
Explanation: Last duplicate element is 6 having index 4.
```

```
Input: arr[] = [1, 2, 3, 4, 5]
Output: [-1, -1]
Explanation: No duplicate elements are present in the array.

```

 **Constraints:** 
1 ≤ arr.size() ≤ 106
1 ≤ arr[i] ≤ 106

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-11T06:49:38.570Z  

```java
class Solution {
    public int[] dupLastIndex(int[] arr) {
        // Complete the function
        int[] res = new int[2];
                for(int i=arr.length-1;i>0;i--){
                    if(arr[i] == arr[i-1]){
                        res[0] = i;
                        res[1] = arr[i];
                        break;
                    }
                }
                if(res[0]==0 && res[1]==0){
                   res[0] = -1;
                   res[1] = -1;
                }
                return res;
    }
}

```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/last-duplicate-element-in-a-sorted-array5539/1)