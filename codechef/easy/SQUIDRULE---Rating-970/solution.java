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
		    int n=sc.nextInt();
		    int a[]=new int[n];
		    int sum=0;
		    int small=Integer.MAX_VALUE;
		    for(int i=0;i<n;i++){
		        a[i]=sc.nextInt();
		        sum+=a[i];
		        small=Math.min(small,a[i]);
		    }
		    System.out.println(sum-small);
		}

	}
}
