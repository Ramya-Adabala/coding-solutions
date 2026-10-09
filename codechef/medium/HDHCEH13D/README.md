# HDHCEH13D

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### object reference Employee class

Consider the following java code

```
class Employee {
    String name;
    void setName(String name) {
        this.name = name;
    }
}

public class Main {
    static void modify(Employee e1, Employee e2) {
        e1.name = "Changed by e1";
        e2 = new Employee();
        e2.name = "New Employee";
    }

    public static void main(String[] args) {
        Employee emp1 = new Employee();
        Employee emp2 = new Employee();
        emp1.setName("Alice");
        emp2.setName("Bob");

        modify(emp1, emp2);
        System.out.println(emp1.name + " & " + emp2.name);
    }
}

```

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-09T04:24:22.499Z  

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

[View on CodeChef](https://www.codechef.com/problems/HDHCEH13D)