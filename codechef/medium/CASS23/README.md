# CASS23

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Update String

Write a C program to modify the given string  **"RoadChef"**  to  **"CodeChef"**  and print the updated string.

### Sample 1:
Input
Output

```
 
```

```
CodeChef
```

## Solution

**Language:** c_cpp  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-19T15:28:30.798Z  

```c_cpp
// Solution
#include <stdio.h>

int main() {
    char str[] = "RoadChef";
    str[0] = 'C';
    str[2] = 'd';
    str[3] = 'e';
    
    printf("%s", str);
    
    return 0;
}

```

---

[View on CodeChef](https://www.codechef.com/problems/CASS23)