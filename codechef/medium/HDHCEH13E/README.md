# HDHCEH13E

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Box class mcq question

What will be the output of the following Java code?

```
class Box {
    int value;

    Box(int value) {
        this.value = value;
    }

    void update(Box b) {
        b.value += 10;
        b = new Box(100);
        b.value += 20;
    }
}

public class Main {
    public static void main(String[] args) {
        Box[] boxes = new Box[2];
        boxes[0] = new Box(5);
        boxes[1] = boxes[0];

        boxes[1].update(boxes[0]);
        System.out.println(boxes[0].value + " & " + boxes[1].value);
    }
}

```

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-09T04:24:48.503Z  

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

[View on CodeChef](https://www.codechef.com/problems/HDHCEH13E)