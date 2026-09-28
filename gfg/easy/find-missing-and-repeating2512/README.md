# Missing And Repeating

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given an unsorted array  **arr[]** of size  **n**, containing elements from the range  **1** to **n**, it is known that one number in this range is missing, and another number occurs twice in the array, find the both numbers.

**Examples:
**

```
Input: arr[] = [2, 2]
Output: [2, 1]
Explanation: Repeating number is 2 and the missing number is 1.
```

```
Input: arr[] = [1, 3, 3] 
Output: [3, 2]
Explanation: Repeating number is 3 and the missing number is 2.
```

```
Input: arr[] = [4, 3, 6, 2, 1, 1]
Output: [1, 5]
Explanation: Repeating number is 1 and the missing number is 5.
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-28T13:56:08.040Z  

```java
class Solution {
    ArrayList<Integer> findTwoElement(int arr[]) 
    {
        int n = arr.length;
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(-1,-1));
        Map<Integer,Integer> map = new HashMap<>();
        for(int num : arr)
        {
            map.put(num,map.getOrDefault(num,0)+1);
        }

        for(int i=1;i<=n;i++)
        {
            if(!map.containsKey(i))
            {
                list.set(1,i);
            }
            else if(map.get(i) > 1)
            {
                list.set(0,i);
            }
        }
        return list;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/find-missing-and-repeating2512/1)