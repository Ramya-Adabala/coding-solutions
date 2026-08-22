# NBFAGD24

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Check Voting Eligibility

In this example, we will determine whether a person is eligible to vote based on their age. Our goal is to use the  **greater than or equal to (`>=`)**  operator to check if the person meets the minimum voting age requirement.

 **Steps to follow:** 

- Declare and initialize legalAge with the value 18 (minimum voting age).
- Declare and initialize personAge with the value 20.
- Compare personAge with legalAge using >= and store the result in canVote.

 **Expected Output** 

```
Is the person eligible to vote? true

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-22T12:33:59.370Z  

```java
class Codechef {
    public static void main(String[] args) {
        int legalAge = 18;  // Minimum age to vote
        int personAge = 20; // Age of the person

        // Write code to compare and print result in given format
        boolean isEligible= personAge>=legalAge;
        System.out.println("Is the person eligible to vot?"+ isEligible);
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/NBFAGD24)