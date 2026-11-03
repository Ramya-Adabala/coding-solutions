# sort-first-half-in-ascending-and-second-half-in-descending1714

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-03T11:06:08.556Z  

```java
class Solution {
    public ArrayList<Integer> customSort(int[] arr) {
        // code here
        ArrayList<Integer> list1=new ArrayList<>();
                ArrayList<Integer> list2=new ArrayList<>();
                for(int i=0;i<arr.length/2;i++)
                 list1.add(arr[i]);
                Collections.sort(list1);
                for(int i=arr.length/2;i<arr.length;i++)
                 list2.add(arr[i]);
                Collections.sort(list2);
                ArrayList<Integer> list=new ArrayList<>();
                for(int i=0;i<list1.size();i++)
                 list.add(list1.get(i));
                for(int i=list2.size()-1;i>=0;i--)
                 list.add(list2.get(i));
              return list;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/sort-first-half-in-ascending-and-second-half-in-descending1714/1)