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
		    HashMap<Integer,Integer> hm=new HashMap<>();
		    int n=sc.nextInt();
		    int a[]=new int[n];
		    for(int i=0;i<n;i++){
		        a[i]=sc.nextInt();
		        hm.put(a[i],hm.getOrDefault(a[i],0)+1);
		    }
		   for(int i=0;i<n;i++){
		       System.out.print(hm.get(a[i])+" ");
		   }
		    System.out.println();
		}
		

	}
}
