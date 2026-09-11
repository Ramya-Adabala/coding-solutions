# BM08E

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Practice problem - Absolute function

Chef and Chefina both love chocolates.
Chef's parents gave you $A$ chocolates out of a total of $N$ chocolates.
The remaining chocolates were given to Chefina.
What was the difference between the count of chocolates received by Chef and Chefina?

### Input Format
- The first line of input will contain a single integer $T$, denoting the number of test cases.
- Each test case contains 2 space separated integers - $N$ and $A$
### Output Format

For each test case, output on a new line the the difference between the count of chocolates received by Chef and Chefina.

### Sample 1:
Input
Output

```
2
100 90
40 10
```

```
80
20
```

### Explanation:

 **Test case 1:**  Chef received 90 Chocolates. Chefina will get 10 chocolates.
Hence the difference of the chocolates received is 80.

 **Test case 2:**  Chef received 10 Chocolates. Chefina will get 30 chocolates.
Hence the difference of the chocolates received is 20.

## Solution

**Language:** Python  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-11T06:20:35.257Z  

```py
# Update the '_' below to solve the problem

t = int(input())
for i in range(t):
    N, A = map(int, input().split())
    chef_chocolates = A
    chefina_chocolates = N-A
    diff = abs(chefina_chocolates - chef_chocolates)
    print(diff)
```

---

[View on CodeChef](https://www.codechef.com/problems/BM08E)