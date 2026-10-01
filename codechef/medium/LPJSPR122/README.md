# LPJSPR122

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Print factorial

Write a program that uses a while loop to find the factorial of a given number.

### Sample 1:
Input
Output

```
5
```

```
120
```

## Solution

**Language:** JavaScript  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-01T02:07:25.842Z  

```js
  let N = parseInt(inputChar);
  
  // Write your code here
  let ans=1;
  let i=1;
  while(i<=N){
      ans*=i;
      i++;
  }
  console.log(ans);
```

---

[View on CodeChef](https://www.codechef.com/problems/LPJSPR122)