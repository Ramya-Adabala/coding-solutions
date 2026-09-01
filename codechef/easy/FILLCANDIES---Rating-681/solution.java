import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int m = sc.nextInt();
            
            // Maximum candies a single bag can hold
            int bagCapacity = k * m;
            
            // Calculate minimum bags needed (equivalent to ceil(n / bagCapacity))
            int bagsNeeded = (n + bagCapacity - 1) / bagCapacity;
            
            System.out.println(bagsNeeded);
        }
        sc.close();
    }
}