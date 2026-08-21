# SKDNBU30

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Parcel Distribution System

A logistics company tracks parcel distribution by adding new stock to existing parcels and determining undelivered parcels after shipment.
The system first adds new parcels, then calculates leftover parcels after distributing them among trucks using the  **modulus assignment (`%=`) operator**.

 **Expected Output:** 

```
1

```

Run the code and modify the values to test different scenarios!

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-21T10:37:01.074Z  

```java
class Codechef {
    public static void main(String[] args) {
        // Given variables: Initial parcels, new arrivals, and number of trucks
        int currentParcels = 250, newParcels = 80, totalTrucks = 7;

        // Add new parcels to current stock
             currentParcels+=newParcels;

        // Find undelivered parcels using %= after distributing equally among trucks
currentParcels%=totalTrucks;

        //  Print the number of undelivered parcels
System.out.println(currentParcels);

    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/SKDNBU30)