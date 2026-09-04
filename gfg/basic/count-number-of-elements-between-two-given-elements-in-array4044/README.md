# Max Distance Between Two in Array

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

Given an unsorted array  **arr[]**  and two distinct elements  **x**  and  **y**, find how many elements lie between them in the array, excluding  **x**  and  **y**  themselves.

- If either x or y appears multiple times in the array, consider the pair of occurrences that are farthest apart (i.e., have the maximum distance between their indices). 
- If either of the given elements is not present in the array, return -1.

 **Examples:** 

```
Input: arr[] = [4, 2, 1, 10, 6], x = 4, y = 6
Output: 3
Explanation: We have an array [4, 2, 1, 10, 6] and x = 4 and y = 6. Elements between them are [2, 1, 10] 
```

```
Input: arr[] = [3, 2, 7, 2, 6, 1, 4], x = 2, y = 4
Output: 4
Explanation: The farthest 2 and 4 have four elements between them.
```

```
Input: arr[] = [3, 2, 7], x = 2, y = 4
Output: -1
Explanation: 4 is not present in the array.
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-04T15:54:12.559Z  

```java
class Solution {
    public int getCount(int[] arr, int x, int y) {
        // code here
        int diff = 0;
        int p1 = -1;
        int p2 = -1;

        for(int i = 0 ; i < arr.length ; i++){

            if(arr[i] == x){

                p1 = i;
                break;
            }

        }

        for(int i = arr.length-1 ; i >= 0 ; i--){

            if(arr[i] == y){

                p2 = i;
                break;
            }
        }
        if(p1 == -1 || p2 == -1) return -1;
        diff = (p2 - p1) - 1;
        return diff;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/count-number-of-elements-between-two-given-elements-in-array4044/1)