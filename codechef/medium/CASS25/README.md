# CASS25

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### String Length II - MCQ

Which function is used to find the length of a string in C?

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-19T15:29:01.838Z  

```cpp
// Solution
#include <stdio.h>

int main() {
    char str[] = "ChefSaysHi";
    int upper_case_count = 3; // 'C', 'S', 'H';
    int lower_case_count = 7; // 'h', 'e', 'f', 'a', 'y', 's', 'i'
    printf("%d %d", upper_case_count, lower_case_count);
    return 0;
}

```

---

[View on CodeChef](https://www.codechef.com/problems/CASS25)