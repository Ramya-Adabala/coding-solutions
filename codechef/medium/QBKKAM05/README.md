# QBKKAM05

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Movie Night Eligibility Check

Write a program to determine if a person is eligible for movie night based on their age and whether they have a ticket.
Use the logical AND (`&&`) operator to ensure both conditions are met & Print the person's age, ticket status, and movie night eligibility.

 **Steps to Complete:** 

- Check if the person is at least 13 years old.
- Verify if the person has a movie ticket.
- Determine eligibility based on both conditions.

 **Expected Output** 

```
Age: 15
Has Ticket: true
Is Eligible for Movie Night: true 

```

Write the code and click on the "Submit" button to see the output.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-23T12:17:11.409Z  

```java
class Codechef {
    public static void main(String[] args) {
        // Step 1: Initialize the person's age
        int age = 15;

        // Step 2: Check if the person has a movie ticket
        boolean hasTicket = true;

        // Step 3: Determine eligibility for movie night (age >= 13 and has a ticket)
       boolean isEligible=age>=13 && hasTicket;
          if(isEligible){
              System.out.println("Age:"+ age);
          

        // Step 4: Print the person's age


        // Step 5: Print whether the person has a ticket

       System.out.println("Has Ticket:"+ hasTicket);
        // Step 6: Print if the person is eligible for movie night
        System.out.println("Is Eligible for Movie Night: " + isEligible);
    }}
}


```

---

[View on CodeChef](https://www.codechef.com/problems/QBKKAM05)