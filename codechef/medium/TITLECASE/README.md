# TITLECASE

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-17T09:53:52.643Z  

```java
 public static String findLargestOddSubstring(String num) {
     //write your code here...
     int n=num.length();
     String s=num;
     for(int i=n-1;i>=0;i--){
         if(num.charAt(i)%2==1)
         return num.substring(0,i+1);
  
     }
     return "-1";
 }
```

---

[View on CodeChef](https://www.codechef.com/problems/TITLECASE)