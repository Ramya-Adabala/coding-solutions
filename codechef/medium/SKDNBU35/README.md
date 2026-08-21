# SKDNBU35

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Inventory Stock Adjustment

A warehouse management system tracks product stock and updates it after incoming and outgoing shipments. T

- The system first adds new stock,
- then removes damaged units,
- and finally assigns the updated stock count to multiple storage locations using chained assignments (=).

 **Expected Output:** 

```
650  
650  
650  

```

Run the code and modify the values to test different scenarios!

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-21T10:39:27.491Z  

```java
class Codechef {
    public static void main(String[] args) {
        // Given variables: Initial stock, new stock added, and damaged units
        int initialStock = 500, newStock = 200, damagedUnits = 50, storageA, storageB, storageC;

        // Adjust initialStock by adding newStock and subtracting damagedUnits
    initialStock+=newStock;
    initialStock-=damagedUnits;


        // Assign the final stock count to all storage locations using chained assignment
          storageA=storageB=storageC=initialStock;

        // Print updated stock values in all storage locations
        System.out.println(storageA);
        System.out.println(storageB);
        System.out.println(storageC);
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/SKDNBU35)