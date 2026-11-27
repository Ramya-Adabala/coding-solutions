# LB06B - Rating 641

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

### Problem (Flip cards) - Generate examples

Now that we have understood the problem statement, let us write down a few more sample cases or examples.
Review the sample input / output given in the table below.

### Sample 1:
Input
Output

```
6 sample inputs
6 1
6 2
6 3
6 4
6 5
6 6
```

```
6 sample outputs
1
2
3
2
1
0
```

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-27T00:24:21.271Z  

```cpp
# Solution as follows
# Remember - there is no t in this problem

X, Y = map(int,input().split())

#declare a variable watchtime to store the solution
watchtime = (X - Y) + (Y//2)     

print(watchtime)
```

---

[View on CodeChef](https://www.codechef.com/problems/LB06B)