# LXXRCH05

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Movie Ticket System
- Let’s practice how to use a default constructor to initialize objects with present values and how to classify data using conditional logic.
- In this problem, you are given a MovieTicket class with two instance variables: movieName and ticketPrice. Two ticket objects are already created in the main method.
- Your task is to complete the constructor to assign default values to the ticket. By default, the ticket should be for the movie “Minions” with a price of ₹250.0. and complete the logic inside the showInfo() method to: Print Category: Premium if the ticket price is greater than ₹300. Print Category: Regular otherwise

 **Expected Output:** 

```
Ticket 1:
Movie: Minions
Price: ₹250.0
Category: Regular

Ticket 2:
Movie: Interstellar
Price: ₹350.0
Category: Premium

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-10T04:17:29.007Z  

```java
class MovieTicket {
    // Instance variables
    String movieName;
    double ticketPrice;

    // Default constructor: sets a predefined movie and price
    MovieTicket() {
        movieName = "Minions";
        ticketPrice = 250.0;
    }

    // Method to display ticket details and category
    void showInfo() {
        System.out.println("Movie: " + movieName);
        System.out.println("Price: ₹" + ticketPrice);

        // Determine and print the ticket category
        if (ticketPrice > 300) {
            System.out.println("Category: Premium");
        } else {
            System.out.println("Category: Regular");
        }
        System.out.println(); // Blank line for readability
    }
}

public class Main {
    public static void main(String[] args) {
        // Create two MovieTicket objects
        MovieTicket ticket1 = new MovieTicket(); // Uses default values
        MovieTicket ticket2 = new MovieTicket(); 

        // Update the second ticket’s details
        ticket2.movieName = "Interstellar";
        ticket2.ticketPrice = 350.0;

        // Display information for both tickets
        System.out.println("Ticket 1:");
        ticket1.showInfo();

        System.out.println("Ticket 2:");
        ticket2.showInfo();
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/LXXRCH05)