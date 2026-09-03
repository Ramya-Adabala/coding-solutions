# CTMNMF45

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Sum of squares, excluding numbers ending with 5

Write a Java program to calculate the sum of squares of numbers from  **1 to n**, skipping numbers that end with  **5**.

 **Input:**  Take n from user.

 **Steps to Complete:** 

- Prompt the user to enter a positive integer as the upper limit.
- Use a while loop to iterate from 1 to the given limit, checking if a number ends with 5.
- Skip numbers ending with 5 using continue, and calculate the sum of squares for the remaining numbers.
- Print the final sum after completing the loop.
### Sample 1:
Input
Output

```
10
```

```
Sum of squares (excluding numbers ending with 5): 360
```

### Explanation:

$1^2 + 2^2 + 3^2 + 4^2 + 6^2 + 7^2 + 8^2 + 9^2 + 10^2$ = 360
Numbers ending in 5 are skipped in the calculation above.

### Sample 2:
Input
Output

```
5
```

```
Sum of squares (excluding numbers ending with 5): 30
```

### Explanation:

$1^2 + 2^2 + 3^2 + 4^2$ = 30
5 is skipped in the calculation above

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-03T04:16:48.261Z  

```java
import java.util.Scanner;

class Codechef {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create Scanner object for user input
        
        int limit = scanner.nextInt(); // Take user input for the upper limit
        
        int sum = 0; // Variable to store the sum of squares
        int num = 1; // Start number from 1

        // Iterate from 1 to the given limit
        while(num<=limit){
            if(num%10==5){
                num++;
                continue;
                
            }
            sum+=(num*num);
            num++;
        }






        // Print the final sum
        System.out.println("Sum of squares (excluding numbers ending with 5): " + sum);
        
        scanner.close(); // Close the scanner
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/CTMNMF45)