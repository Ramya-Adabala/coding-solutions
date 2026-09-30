# print-pattern3549

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-30T14:02:42.589Z  

```java
class Solution {
    public ArrayList<Integer> pattern(int n) {
        // code here
        ArrayList<Integer> list=new ArrayList<>();
        if(n<=0){
            list.add(n);
            return list;
        }

        solve(n,list);
        return list;
    }


    public void solve(int n,ArrayList<Integer> list){
        if(n<=0){
            list.add(n);
            return;
        }

        list.add(n);
        solve(n-5,list);
        list.add(n);


    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/print-pattern3549/1)