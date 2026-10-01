# LPJSPR123

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Find the number of digits

Given an integer  **N**, Calculate and print the number of digits present in  **N**.

### Constraints
- $1 \leq N \leq 10000$
### Sample 1:
Input
Output

```
1543
```

```
4
```

## Solution

**Language:** JavaScript  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-01T02:08:15.248Z  

```js
  let N = parseInt(inputChar);
  
  // Write your code here
  let digit=0;
  while(N>0){
      digit++;
      N=Math.floor(N/10);
  }
  console.log(digit);
```

---

[View on CodeChef](https://www.codechef.com/problems/LPJSPR123)