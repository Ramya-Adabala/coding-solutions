# Method Overloading  in Java

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Implement  **Calculator** class with the following methods to understand Method Overloading in Java:
Note: Driver code makes all the function calls and print statements.

```
Name: sum
Parameters: a(int), b(int)
Return: sum of a and b -> int
```

```
Name: sum
Parameters: a(int), b(int), c(int)
Return: sum of a, b and c -> int
```

```
Name: sum
Parameters: x(double), y(double)
Return: sum of x and y -> double
```

 **Example:** 

```
Input: a = 5, b = 10, c = 3, x = 15.5, y = 3.5
Output: 
15
18
19.0
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-08T01:47:40.678Z  

```java
//  Implement Calculator class with all methods
class Calculator{
    public int sum(int a,int b){
        return a+b;
    }
    public int sum(int a,int b,int c){
        int d=(a+b)+c;
        return d;
    }
    public double sum(double a ,double b){
        return a+b;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/method-overloading-in-java/1)