import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		long a[]=new long[n];
		for(int i=0;i<n;i++){
		    a[i]=sc.nextInt();
		}
		int sum=0;
		for(int i=0;i<k;i++){
		    sum+=a[i];
		}
		int max=sum;
		for(int i=k;i<n;i++) {
		    sum+=a[i]-a[i-k];
		    if(sum>max){
		        max=sum;
		    }
		}
		System.out.println(max);

	}
}
