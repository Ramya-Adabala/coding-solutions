# LCPPAS153

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Convert speed

Create a variable named  **speed1**  and assign it the value 36, representing speed in kilometers per hour. Then, convert and display this speed in meters per second.

[ **Note:**  1 km/h = 5/18 m/s]

 **Output:** 

```
10

```

## Solution

**Language:** c_cpp  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-04T10:36:39.799Z  

```c_cpp
#include <iostream>
using namespace std;

int main() {
	int speed1 = 36; // representing speed in km/hr
	int speed2 = 36 * 5 / 18; // representing speed in m/s
	cout<<speed2<<"\n";

}

```

---

[View on CodeChef](https://www.codechef.com/problems/LCPPAS153)