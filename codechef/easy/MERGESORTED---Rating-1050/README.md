# MERGESORTED - Rating 1050

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

### Merge two sorted arrays

You are given two sorted arrays $A$ and $B$ of size $N$ and $M$ respectively. You need to merge these two arrays and keep the final array sorted.

### Input Format
- The first line contains two integers $N$ and $M$ — the size of array $A$ and $B$
- The second line contains all the elements of array $A$
- The third line contains all the elements of array $B$
### Output Format

Output the merged array elements on a single line.

### Constraints
- $1 \leq N, M \leq 10^5$
- $1 \leq A_i, B_i \leq 10^5$
### Sample 1:
Input
Output

```
5 4
1 4 8 9 10
2 3 5 6
```

```
1 2 3 4 5 6 8 9 10
```

### Sample 2:
Input
Output

```
1 2
10
1 2
```

```
1 2 10
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-06T04:37:58.867Z  

```java
import java.util.Scanner;

class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        int[] a = new int[n];
        int[] b = new int[m];
        
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < m; i++) {
            b[i] = sc.nextInt();
        }
        
        int i = 0, j = 0;
        StringBuilder sb = new StringBuilder();
        
       
        while (i < n && j < m) {
            if (a[i] <= b[j]) {
                sb.append(a[i]).append(" ");
                i++;
            } else {
                sb.append(b[j]).append(" ");
                j++;
            }
        }
        
      
        while (i < n) {
            sb.append(a[i]).append(" ");
            i++;
        }
        
      
        while (j < m) {
            sb.append(b[j]).append(" ");
            j++;
        }
        
        System.out.println(sb.toString().trim());
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/MERGESORTED)