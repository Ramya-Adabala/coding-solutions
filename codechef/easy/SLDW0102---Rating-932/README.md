# SLDW0102 - Rating 932

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

### Maximum Sum of K Elements

You are given an array $A$ containing $N$ elements and an integer $K$. You have to find the subarray with the maximum sum among all the K-sized sub-arrays and output this maximum sum.

This is a perfect example of a question that can be efficiently solved using the sliding window approach.
Normally, we would calculate the sum of all K-sized sub-arrays which would have the time complexity of $O(N)$.
But, using the Sliding Window approach we can assume the K-sized subarray to be a window. Now we just need to calculate the sum of the first window as the sum of the next window can be derived from the previous sum by subtracting the first element and adding the next element.

For example, let's take an array $A = [1, 2, 3, 4, 5, 6, 7]$ and $K = 3$.

- Let's calculate the sum of the first window of three elements. $1+2+3 = 6$
- Now the next window will have element ${2, 3, 4}$.
- Compared to the previous window the first element $(1)$ is removed and the next element $(4)$ is added.
- So, we can calculate the next window's sum by subtracting $1$ and adding $4$ to the sum of the previous window.
- Thus, the sum of the next window will be $6-1+4 = 9$

Solve the above question using the Sliding Window approach

### Input Format
- The first line of the input contains a single integer $N$ and $K$, denoting the length of the array $A$ and the length of the sub-array.
- The second line of the input contains $N$ space-separated integers $A_1, A_2, \ldots, A_N$ — denoting the array $A$.
### Output Format
- Output the maximum sum.
### Constraints
- $2 \leq N \leq 10^5$
- $1 \leq A_i \leq 10^9$
- $2 \leq K \leq N$
### Sample 1:
Input
Output

```
10 3
9 8 2 4 1 9 9 5 1 8
```

```
23
```

### Explanation:

The subarray {9, 9, 5} has the maximum sum.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-09T04:22:43.686Z  

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

[View on CodeChef](https://www.codechef.com/problems/SLDW0102)