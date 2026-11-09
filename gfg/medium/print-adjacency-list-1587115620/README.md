# print-adjacency-list-1587115620

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-09T11:50:07.102Z  

```java
class Solution {
    public List<List<Integer>> printGraph(int V, int edges[][]) {
        // code here
        List<List<Integer>>adj=new ArrayList<>();
               for(int i=0;i<V;i++)
               {
                   adj.add(new ArrayList<Integer>());
               }
               for(int edge[]:edges)
               {
                   int u=edge[0];
                   int v=edge[1];
                   adj.get(u).add(v);
                   adj.get(v).add(u);
               }
               return adj;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/print-adjacency-list-1587115620/1)