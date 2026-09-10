# Next Prime Number

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given an integer **n**  **.** Write a program to find the first prime number greater than  **n.** 

 **Examples:** 

```
Input: n = 15
Output: 17
Explanation: 17 is next prime number.
```

```
Input: n = 7
Output: 11
Explanation: 11 is the prime number next to 7.
```

 **Constraints:** 
1 <= n <= 500

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-10T02:08:57.615Z  

```java
// User function Template for Java
class Solution {
    public static int nextPrime(int n) {
int  num=n+1;
        while(true){
            if(isprime(num)) return num;
            num+=1;
        }}
        public static boolean isprime(int num){
            if(num<2) return false;
            for(int i=2;i<=Math.sqrt(num);i++){
                if(num%i==0)
                return false;
            }
        return true;
        }}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/next-prime-number/1)