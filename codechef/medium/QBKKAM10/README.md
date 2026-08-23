# QBKKAM10

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Loan Eligibility

Write a program to check if an applicant is eligible for a loan based on their credit score or monthly income.
Use the logical OR (`||`) operator to ensure that at least one condition is met.

 **Steps to Complete** 

- Define the credit score & monthly income of the applicant.
- Use the logical OR (||) operator to check loan eligibility.
- Print the final loan eligibility result.

 **Expected Output** 

```
Eligible for Loan: true

```

Write the code and click on the "Submit" button to see the output.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-23T12:20:54.812Z  

```java
class Codechef {
    public static void main(String[] args) {
        // Step 1: Define the credit score of the applicant
        int creditScore = 650;

        // Step 2: Define the monthly income of the applicant
        double monthlyIncome = 55000;

        // Step 3: Evaluate the loan eligibility using the OR operator
        // The applicant is eligible if their credit score is 700 or higher,
        // OR their monthly income is 50,000 or higher
    boolean isEligible=(creditScore >= 700) || (monthlyIncome >= 50000);

        // Step 4: Display the loan eligibility result
        System.out.println("Eligible for Loan: " + isEligible);
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/QBKKAM10)