# LPJSPR121

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Print Squares

Write a program that utilizes a while loop to print the squares of numbers from 1 to $N$

Check the sample input / output below further clarity.

### Sample 1:
Input
Output

```
5
```

```
1 4 9 16 25
```

## Solution

**Language:** JavaScript  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-01T02:06:18.331Z  

```js
    let N = parseInt(inputChar);
    let y = 1;
    let result = [];

    while (y <= N) {
     
        result.push(y * y);
        y++;
    }
   
    
    console.log(result.join(' '));
```

---

[View on CodeChef](https://www.codechef.com/problems/LPJSPR121)