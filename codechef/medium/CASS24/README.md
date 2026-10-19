# CASS24

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Count UpperCase and LowerCase Characters

Write a C program that prints the count of uppercase and lowercase alphabets in the given string.

### Task
- A string variable str is given in the IDE, with some string assigned to it.
- The string consists of only English alphabets.
- Count the uppercase and lowercase alphabets and print them on console with a space between them.

## Solution

**Language:** c_cpp  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-19T15:28:51.414Z  

```c_cpp
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

[View on CodeChef](https://www.codechef.com/problems/CASS24)