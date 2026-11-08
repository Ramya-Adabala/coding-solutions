# ZWFPSZ11

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-08T09:23:52.635Z  

```java
import java.util.Scanner;

class Codechef {
    public static void main(String[] args) {
        // Creating a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Prompting the user to input a temperature value in Celsius
        // The value is expected to be of type double
        double celsius = scanner.nextDouble(); // Storing the input in the 'celsius' variable

        // Converting the Celsius temperature to Fahrenheit using the formula: (C * 9/5) + 32
        double fahrenheit = (celsius * 9/5) + 32; // Storing the converted value in 'fahrenheit'

        // Displaying the converted Fahrenheit temperature
        System.out.println("Temperature in Fahrenheit: " + fahrenheit);

        // Closing the Scanner object to release system resources and prevent memory leaks
        scanner.close();
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/ZWFPSZ11)