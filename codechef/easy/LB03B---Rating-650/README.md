# LB03B - Rating 650

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

### Problem 3 (High Accuracy) - Generate examples

Now that we have understood the problem statement, let us write down a few more sample cases or examples.
Review the sample input / output given in the table below.

### Sample 1:
Input
Output

```
6 sample inputs
11
12
13
14
15
16
```

```
6 expected outputs
1
0
2
1
0
2
```

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-26T00:16:06.829Z  

```cpp
# Solution as follows

t = int(input())            
for i in range(t):          
    X, Y, Z = map(int, input().split())
    
    #Borrow the template from our sub-component
    if (Z%X == 0) and (Z%Y == 0):   
        print('ANY')
    elif (Z%X == 0):
        print('CHICKEN')
    elif (Z%Y == 0):
        print('DUCK')
    else:
        print('NONE')

```

---

[View on CodeChef](https://www.codechef.com/problems/LB03B)