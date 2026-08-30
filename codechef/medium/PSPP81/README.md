# PSPP81

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Variable scope

Listen

Scope in Python can be broadly categorized into two types:  **global scope**  and  **local scope** 

#### Global scope
- Variables defined outside of any function have global scope.
- These variables can be accessed from anywhere in the code, both inside and outside functions.

```
global_var = 10

def my_function():
    print(global_var)  # Accessing the global variable

print(global_var)  # Accessible here
my_function()  # Calls the function, which accesses global_var internally

```

 **Output** 

```
10
10

```

Once we defined the `global_var` at the top, it can be used anywhere in the code.

#### Local scope
- Variables defined within a function have local scope, meaning they are accessible only within that function.
- Local scope is limited to the function where the variable is defined.

```
def my_function():
    local_var = 20  # Local variable
    print(local_var)  # Accessible here

print(local_var)  # Error: local_var is not defined (outside its scope)

```

Because the `local_var` was defined inside the function, you cannot print it outside the function.

#### Accessing Variables from Different Scopes
- A function can access variables in its local scope, as well as variables in the global scope.
- However, a local variable will take precedence over a global variable if they have the same name.

 **Review the code in the IDE and click on 'Submit' to know the result.**

## Solution

**Language:** Python  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-30T06:01:10.804Z  

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

[View on CodeChef](https://www.codechef.com/problems/PSPP81)