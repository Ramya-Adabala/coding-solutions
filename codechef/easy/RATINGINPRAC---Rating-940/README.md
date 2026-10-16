# RATINGINPRAC - Rating 940

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-16T12:29:46.403Z  

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Write your code here
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int frames[]=new int[n];
            for(int i=0;i<n;i++){
                frames[i]=sc.nextInt();
            }
            int min=n;
            for(int i=0;i<n-1;i++){
                if(frames[i]==frames[i+1]){
                    min--;
                    
                }
            }
            System.out.println(min);
        }
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/RATINGINPRAC)