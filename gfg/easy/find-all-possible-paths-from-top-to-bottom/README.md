# Grid Paths from Top to Bottom Corner

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given an  **n x m**  matrix  **mat[][]**, find all possible paths from the top-left cell  **(0, 0)**  to the bottom-right cell  **(n-1, m-1)**.

From each cell, movement is restricted to two directions:

- Right → (i, j+1)
- Down → (i+1, j)

Return all possible paths, where each path is represented as a list of matrix elements encountered along the way.

 **Examples:** 

```
Input: mat[][] = [[1, 2, 3], [4, 5, 6]]
Output: [[1, 4, 5, 6], [1, 2, 5, 6], [1, 2, 3, 6]]
Explanation: There are 3 possible paths from cell (0,0) to (1,2).
```

```
Input: mat[][] = [[1, 2], [3, 4]]
Output: [[1, 2, 4], [1, 3, 4]]
Explanation: There are 2 possible paths from cell (0,0) to (1,1).
```

 **Constraints:** 
1 <= n, m <= 10 
1 <= mat[i][j] <= n*m
n * m < 20

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-18T13:00:05.529Z  

```java
import java.util.ArrayList;

class Solution {
    public static ArrayList<ArrayList<Integer>> allPaths(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;

        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        ArrayList<Integer> currentPath = new ArrayList<>();

        solve(0, 0, n, m, mat, currentPath, result);

        return result;
    }

    private static void solve(int i, int j, int n, int m, int[][] mat, 
                              ArrayList<Integer> currentPath, 
                              ArrayList<ArrayList<Integer>> result) {
        if (i >= n || j >= m) {
            return;
        }

        currentPath.add(mat[i][j]);

        if (i == n - 1 && j == m - 1) {
            result.add(new ArrayList<>(currentPath));
        } else {
            // Down move
            solve(i + 1, j, n, m, mat, currentPath, result);
            // Right move
            solve(i, j + 1, n, m, mat, currentPath, result);
        }

        // Backtrack
        currentPath.remove(currentPath.size() - 1);
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/find-all-possible-paths-from-top-to-bottom/1)