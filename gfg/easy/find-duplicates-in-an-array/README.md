# Duplicates in a Limited Range Array

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given an array  **arr[]**  of size **n**, containing elements from the range  **1** to **n**, and each element appears at most  **twice**, return an array of all the integers that appears twice.

 **Note:**  You can return the elements in any order but the driver code will print them in sorted order.

 **Examples:** 

```
Input: arr[] = [2, 3, 1, 2, 3]
Output: [2, 3] 
Explanation: 2 and 3 occur more than once in the given array.
```

```
Input: arr[] = [3, 1, 2] 
Output: []
Explanation: There is no repeating element in the array, so the output is empty.
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-17T14:08:55.454Z  

```java
class Solution {
    public ArrayList<Integer> findDuplicates(int[] arr) {
        // code here
        ArrayList<Integer> obj=new ArrayList<>();
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int x:arr){
            hm.put(x,hm.getOrDefault(x,0)+1);
        }
        for(Map.Entry<Integer,Integer> e:hm.entrySet()){
            if(e.getValue().equals(2))
            obj.add(e.getKey());
        }
        return obj;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/find-duplicates-in-an-array/1)