# TONKSS05

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Team Performance Tracker

A sports analyst tracks player performance in a football match.
Use  **`int`**  for goals and assists (whole numbers) and  **`double`**  for player ratings (decimal values) while declaring multiple variables in a single statement for efficiency.

 **Expected Output:** 

```
Goals Scored: 3  
Assists Made: 2  
Shots on Target: 5  
Player 1 Rating: 8.5  
Player 2 Rating: 7.9  

```

Run the code, modify values, and analyze different match scenarios!

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-27T00:44:26.137Z  

```java
class Codechef {
    public static void main(String[] args) {
        // Declare and assign multiple int variables in one statement
        int goalsScored = 3, assistsMade = 2, shotsOnTarget = 5;

        // Declare and assign multiple double variables in one statement
        double playerRating1 = 8.5, playerRating2 = 7.9;

        // Print all values
        System.out.println("Goals Scored: " + goalsScored);
        System.out.println("Assists Made: " + assistsMade);
        System.out.println("Shots on Target: " + shotsOnTarget);
        System.out.println("Player 1 Rating: " + playerRating1);
        System.out.println("Player 2 Rating: " + playerRating2);
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/TONKSS05)