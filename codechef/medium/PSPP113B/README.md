# PSPP113B

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Debug this code

What will the following code output?

```
def manipulate_tuple(my_tuple):
    # Add an element to the tuple
    my_tuple.append(4)
    
    # Remove the first element
    my_tuple.remove(1)

    # Access an element beyond the tuple's range
    print("Third element:", my_tuple[2])

# Create a tuple
my_tuple = (1, 2, 3)

# Call the function to manipulate the tuple
manipulate_tuple(my_tuple)

```

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-05T10:09:35.439Z  

```cpp
student = (["Alice", "Bob"], ["Math", "Science", "English"], 20, 'XYZ')

# Update the code below this line
list_1, list_2, num, string = student

# print the relevant components
print(list_1[1])
print(list_2[2])
print(num)
print(string[2])
```

---

[View on CodeChef](https://www.codechef.com/problems/PSPP113B)