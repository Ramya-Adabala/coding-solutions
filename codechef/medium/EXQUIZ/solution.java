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
		    long n=sc.nextInt();
		    long s=sc.nextInt();
		    long c=(s+3)/4;
		    long attempts=5*c-s;
		    if(attempts<=n) System.out.println(attempts);
		    else System.out.println("-1");
		    
		}

	}
}
