# Elements in Range

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

Given an array  **arr[]**  containing distinct positive integers, and two integers start and end defining a range. Find if the array contains all elements within inclusive range [start, end].

 **Examples :** 

```
Input: start = 2, end = 5, arr[] =  [1, 4, 5, 2, 7, 8, 3]
Output: true
Explanation: All integers within the range [2, 5] are 2, 3, 4, and 5, and all of them are present in the array. Therefore, the answer is true for this test case.

```

```
Input: start = 2, end = 6, arr[] = [1, 4, 5, 2, 7, 8, 3]
Output: false
Explanation: The array does not contain 6; hence, it does not contain all the elements in the range [2, 6]. Therefore, the output is false.

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-12T15:44:57.249Z  

```java
class Solution {
    public boolean checkElements(int start, int end, int[] arr) {
        // code here
        int c=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>=start && arr[i]<=end){
                c++;
            }
        }
        if(end-start+1==c) return true;
        else return false;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/elements-in-the-range2834/1)