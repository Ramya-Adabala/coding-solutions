# NDLQGP34

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-28T08:47:47.985Z  

```java
class Codechef{
    public static void main(String[] args) {

        // Step 1: Declare string variables for flight details.
        String departureCity = "New York";
        String destinationCity = "London";
        String timings = "00:13 am";

        // Step 2: Use the join() method to format the flight details into a single structured output.
        // The delimiter " | " is used to separate the details.
        String flightDetails = String.join(" | ", 
                "From: " + departureCity, 
                "To: " + destinationCity, 
                "Timings: " + timings);

        // Step 3: Display the structured flight details.
        System.out.println("Flight Details: " + flightDetails);
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/NDLQGP34)