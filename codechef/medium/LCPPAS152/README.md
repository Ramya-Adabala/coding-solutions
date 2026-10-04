# LCPPAS152

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Print total minutes and seconds

Declare a variable  **hour**  and initialize it with the value $5$ Then, calculate and print the total number of minutes and seconds present in this hour.

### Sample 1:
Input
Output

```

```

```
300
18000
```

## Solution

**Language:** c_cpp  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-04T10:36:21.815Z  

```c_cpp
#include <iostream>

using namespace std;

int main() {
    int hour = 5;
    int minutes = hour * 60;
    int seconds = minutes * 60;
    cout << minutes << endl << seconds;
}
```

---

[View on CodeChef](https://www.codechef.com/problems/LCPPAS152)