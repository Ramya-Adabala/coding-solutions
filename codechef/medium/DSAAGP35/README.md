# DSAAGP35

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Frequency of each element in the array

You are given an integer $N$ and an array containing $N$ integers.
For each element in the array you have to output it's frequency in the array.
Frequency of an element in the array tells how many times it occurs in the array.

Iterate over each element in the array and count the frequency of that element using another loop then print the frequency for each element in the array.

### Input Format
- The first line of input will contain a single integer $T$, denoting the number of test cases.
- Each test case consists of multiple lines of input. The first line of each test case contains one integer $N$ denoting the number of elements in the array. The next line contains $N$ space separated integers, denoting the elements in the array.
### Output Format

For each test case, output $N$ space separated integers denoting the frequency of each element of the array.

### Constraints
- $1 \leq T \leq 100$
- $1 \leq N \leq 100$
- $1 \leq A_i \leq 10$
### Sample 1:
Input
Output

```
3
10
1 2 1 2 1 3 4 1 2 3
5 
1 1 1 1 1
5
1 2 1 2 1
```

```
4 3 4 3 4 2 1 4 3 2
5 5 5 5 5
3 2 3 2 3
```

### Explanation:

 **Test Case 1** : In this array $1$ occurs $4$ times, $2$ occurs $3$ times, $3$ occurs $2$ times and $4$ occurs $1$ times.
 **Test Case 2** : In this array $1$ occurs $5$ times.
 **Test Case 3** : In this array $1$ occurs $3$ times and $2$ occurs $2$ times.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-02T02:34:23.536Z  

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
		    HashMap<Integer,Integer> hm=new HashMap<>();
		    int n=sc.nextInt();
		    int a[]=new int[n];
		    for(int i=0;i<n;i++){
		        a[i]=sc.nextInt();
		        hm.put(a[i],hm.getOrDefault(a[i],0)+1);
		    }
		   for(int i=0;i<n;i++){
		       System.out.print(hm.get(a[i])+" ");
		   }
		    System.out.println();
		}
		

	}
}

```

---

[View on CodeChef](https://www.codechef.com/problems/DSAAGP35)