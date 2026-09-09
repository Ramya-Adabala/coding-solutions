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
		    String A=sc.next();
		    String B=sc.next();
		    int c1=0,c2=0;
		    for(int i=0;i<n;i++){
		        if(A.charAt(i)=='a') c1++;
		        if(B.charAt(i)=='b') c2++;
		        
		    }
		    if(c1==c2) System.out.println("Yes");
		        else System.out.println("No");
		}

	}
}
