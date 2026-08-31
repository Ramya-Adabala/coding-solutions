# RESUFF06

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-31T05:04:44.606Z  

```java
import java.util.Scanner; // Import Scanner class to take input from the user

class Codechef {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create a Scanner object for user input
        
        // Read user input and store it in the 'temperature' variable
        int temperature=sc.nextInt();
        


        // Check if the temperature is above 30
  if(temperature>30){
      System.out.println("It's hot outside! Stay hydrated.");
  }


        // Use one 'else if' to check if the temperature is between 10 and 30 (inclusive)

else if(temperature>=10 && temperature<=30){
    System.out.println("The weather is moderate. Enjoy your day!");
}

        // Use 'else' for all other conditions (temperature below 10)
        else{
            System.out.println("It's cold outside! Wear warm clothes.");
        }




        sc.close(); // Close the Scanner object to free up resources
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/RESUFF06)