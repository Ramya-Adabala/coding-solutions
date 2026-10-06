# ZWFPSZ10

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Converting Celsius to Fahrenheit (Double)

Write a program to convert a temperature value from Celsius to Fahrenheit, focusing on storing user input as a `double`. This will help you understand how to store decimal values and perform calculations using the `double` data type.

 **Steps to Complete:** 

- Prompt the user to input a temperature value in Celsius, which will be stored as a double.
- Convert the Celsius temperature to Fahrenheit using the formula: (Celsius * 9/5) + 32.
- Display the converted Fahrenheit value.
### Sample 1:
Input
Output

```
25
```

```
Temperature in Fahrenheit: 77.0

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-06T04:58:46.205Z  

```java
import java.util.Scanner;

class Codechef {
    public static void main(String[] args) {
        // Creating a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // The value is expected to be of type double
        double celsius=scanner.nextDouble();

        // Converting the Celsius temperature to Fahrenheit using the formula: (C * 9/5) + 32
   double fahrenheit=(celsius *9/5)+32;

        // Displaying the converted Fahrenheit temperature
   System.out.println("Temperature in Fahrenheit: "+fahrenheit);

        // Closing the Scanner object to release system resources and prevent memory leaks
        scanner.close();

    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/ZWFPSZ10)