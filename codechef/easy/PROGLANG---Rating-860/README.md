# PROGLANG - Rating 860

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-15T05:39:06.205Z  

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
		    if(x>=1 &&x<100) System.out.println("Easy");
		    else if(x>=100 && x<200) System.out.println("Medium");
		    else  if(x>=200 && x<=300)
		    System.out.println("Hard");

	}}
}

```

---

[View on CodeChef](https://www.codechef.com/problems/PROGLANG)