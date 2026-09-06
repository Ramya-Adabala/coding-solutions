# PSPP119A

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Coding problem

Listen

You are given an `array A`.

Using your knowledge of dictionary and loops - create a dictionary which has the following characteristics

- Key: Each unique element in the array
- Value: Count of occurrence of each element in the array

Check the sample output below.

### Sample 1:
Input
Output

```
 
```

```
{1: 3, 2: 2, 3: 2, 4: 1, 5: 1}
```

## Solution

**Language:** Python  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-06T05:18:02.428Z  

```py
# Solution as follows

A = [1, 2, 3, 1, 2, 4, 1, 3, 5]
A_freq = {}

for i in A:
    if i in A_freq:
        A_freq[i] = A_freq[i] + 1
    else:
        A_freq[i] = 1
        
print(A_freq)
```

---

[View on CodeChef](https://www.codechef.com/problems/PSPP119A)