# BULLET - Rating 649

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-19T11:15:26.793Z  

```java
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
		    int x=sc.nextInt();
		    int rem=x%3;
		    if (rem == 0) {
                    System.out.println("NORMAL");
                } else if (rem == 1) {
                    System.out.println("HUGE");
                } else {
                    System.out.println("SMALL");
                }
		}

	}
}

```

---

[View on CodeChef](https://www.codechef.com/problems/BULLET)