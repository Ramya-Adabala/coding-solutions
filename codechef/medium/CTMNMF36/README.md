# CTMNMF36

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-15T06:08:25.129Z  

```java
import java.util.Scanner;

class Codechef {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input for n from the user
        int n = sc.nextInt();

        int i = 1;

        // While loop to check numbers from 1 to n
        while (i <= n) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(i);
            }
            i++;
        }

        sc.close();
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/CTMNMF36)