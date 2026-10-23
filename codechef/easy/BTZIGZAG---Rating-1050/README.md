# BTZIGZAG - Rating 1050

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-23T06:24:32.913Z  

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
		int n=sc.nextInt();
		int k=sc.nextInt();
		long a[]=new long[n];
		for(int i=0;i<n;i++){
		    a[i]=sc.nextInt();
		}
		int sum=0;
		for(int i=0;i<k;i++){
		    sum+=a[i];
		}
		int max=sum;
		for(int i=k;i<n;i++) {
		    sum+=a[i]-a[i-k];
		    if(sum>max){
		        max=sum;
		    }
		}
		System.out.println(max);

	}
}

```

---

[View on CodeChef](https://www.codechef.com/problems/BTZIGZAG)