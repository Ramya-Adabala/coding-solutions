# RECUR03

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Sum of N Natural Numbers

Let's suppose we are given an integer $N$ and we have to calculate the sum of first $N$ natural numbers. This problem can easily be broken down to smaller parts of the same nature.

Assuming $Sum(N)$ denotes the sum of first $N$ natural numbers, we can say
$Sum(5) = 5 + Sum(4)$,
which can be broken down further to say
$Sum(5) = 5 + 4 + Sum(3)$
and so on.

These broken down versions are generally called  **sub-problems**. We break the task into sub-problems until the task becomes so small that the solution becomes trivial. Like in the above problem if we keep breaking this into smaller problems, it reaches $1$, where
$Sum(1) = 1$.

Thus the solution becomes trivial.
From the above example, we can say that:
$Sum(N) = N + Sum(N-1)$, until $N > 1$

Let's visualize recursion by calculating the sum of $5$ natural numbers.
Run the code in the editor and check out the output.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-23T06:17:51.415Z  

```java
class Codechef {
    public static void main(String[] args) {
        System.out.println("Sum of first 5 natural numbers is " + sum(5));
    }

    static int sum(int n) {
        System.out.println("Sum(" + n + ") is called");
        if (n == 1) {
            System.out.println("Base Condition reached");
            return 1;
        }
        int sumN1 = sum(n - 1);
        System.out.println("Sum(" + n + ") = " + n + " + Sum(" + (n - 1) + ")");
        int sumN = n + sumN1;
        System.out.println("Sum(" + n + ") = " + n + " + " + sumN1);
        System.out.println("Sum(" + n + ") is returning " + sumN);
        return sumN;
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/RECUR03)