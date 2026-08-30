# PSPP82

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

_Description not available._

## Solution

**Language:** Python  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-30T06:01:14.400Z  

```py
# Click on submit to see the result

# Global variable
x = 10

def my_function():
    # Local variable with the same name as the global variable
    x = 20
    
    # Accesses the local variable
    print(x)

my_function()
# Output: 20

print(x)
# Output: 10 (global variable is not affected)

```

---

[View on CodeChef](https://www.codechef.com/problems/PSPP82)