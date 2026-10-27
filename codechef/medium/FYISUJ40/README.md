# FYISUJ40

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Astronaut Mission Data Tracker

Space agencies track astronaut missions, including mission codes, crew size, and total distance traveled. Use  **`char`**  for mission identifiers,  **`short`**  for crew size, and  **`long`**  for total space distance covered.

 **Expected Output:** 

```
Mission Code: A  
Crew Size: 7  
Distance Traveled: 3000000000 km  

```

Run the code, modify values, and explore different mission details!

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-27T00:42:30.854Z  

```java
class Codechef {
    public static void main(String[] args) {
        // Declare and assign mission details
        char missionCode = 'A';  // Single-character mission identifier
        short crewSize = 7;      // Number of astronauts in the mission
        long distanceTraveled = 3_000_000_000L; // Total distance traveled in space (km)

        // Print the mission data
        System.out.println("Mission Code: " + missionCode);
        System.out.println("Crew Size: " + crewSize);
        System.out.println("Distance Traveled: " + distanceTraveled + " km");
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/FYISUJ40)