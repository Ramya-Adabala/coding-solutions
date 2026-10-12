import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
		    int m=sc.nextInt();
		    int x=sc.nextInt();
		    int y=sc.nextInt();
		    int a[]=new int[m];
		    for(int i=0;i<m;i++){
		        a[i]=sc.nextInt();
		    }
		    int reach = x * y;
		    boolean[] underWatch = new boolean[101];
		    
		    for(int i=0;i<m;i++){
		        int left = Math.max(1, a[i] - reach);
		        int right = Math.min(100, a[i] + reach);
		        
		        for(int h = left; h <= right; h++){
		            underWatch[h] = true;
		        }
		    }
		    
		    int safeHouses = 0;
		    for(int h = 1; h <= 100; h++){
		        if(!underWatch[h]){
		            safeHouses++;
		        }
		    }
		    
		    System.out.println(safeHouses);
		}

	}
}
