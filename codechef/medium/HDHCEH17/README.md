# HDHCEH17

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Changing instances of objects

It's very important to understand whether making changes to instance variables for a particular object of a class affects the remaining objects of the class or not.

 **Syntax** 

```

import java.util.*;
import java.lang.*;
import java.io.*;

class CodechefUser{
    int id;
}

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		CodechefUser user1 = new CodechefUser();
         CodechefUser user2 = new CodechefUser();   
		user1.id = 109;
         user2.id = 212;
		user1.id+=1;
	}
}

```

In the above-mentioned code, try to figure out what the final values will be for the `id` attribute of the `user1` object and the `user2` object after the whole code is compiled and executed.

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-09T04:25:14.958Z  

```cpp
class Variable {
    // variable
    int value;
}

public class Main {
    public static void main(String[] args) {
        // object creation for rectangle class
        Variable v1 = new Variable();
        v1.value = 3;
        Variable v2 = v1;
        v2.value = 7;
        System.out.println("Value of v1 is "+ v1.value);
        System.out.println("Value of v2 is "+ v2.value);
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/HDHCEH17)