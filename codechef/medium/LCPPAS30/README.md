# LCPPAS30

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Convert Temperature

Declare a variable  **"temperature"**  and initialise it with a value of  **25.5**  (in Celsius) and Print it in Celsius and Kelvin(add 273 to temperature in Celsius). [ **Note:**  print the output exactly in the same format as given below.]

### Sample 1:
Input
Output

```

```

```
Celsius - 25.5  
Kelvin - 298.5  
```

## Solution

**Language:** c_cpp  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-03T04:35:13.358Z  

```c_cpp
#include <iostream>
using namespace std;

int main() {
    double temperature = 25.5;
    cout << "Celsius - " << temperature << endl;
    cout << "Kelvin - " << temperature + 273;

    return 0;
}
```

---

[View on CodeChef](https://www.codechef.com/problems/LCPPAS30)