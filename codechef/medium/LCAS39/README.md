# LCAS39

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Palindrome Check

Write a C program to turn the string "CIVVIX" into a Palindrome. To do this, take the last character of the string and make changes to the string as needed. Finally, print the resulting palindrome.

### Sample 1:
Input
Output

```
 
```

```
CIVVIC
```

## Solution

**Language:** c_cpp  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-19T15:27:08.608Z  

```c_cpp
#include <stdio.h>

int main() {
    char input[] = "CIVVIX";
    input[5]='C';
    printf("%s\n", input);

    return 0;
}

```

---

[View on CodeChef](https://www.codechef.com/problems/LCAS39)