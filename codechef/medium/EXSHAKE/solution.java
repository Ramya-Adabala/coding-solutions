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
		   StringBuilder sb=new StringBuilder();
		while(t-->0){
		    int n=sc.nextInt();
		    int m=sc.nextInt();
		    int a[]=new int[n];
		 
		    for(int i=0;i<n;i++){
		        a[i]=sc.nextInt();
		    }
		    Arrays.sort(a);
		    long curr=0;int group=0;
		    for(int x:a){
		        long next=curr+x;
		        long hand=(next*(next-1))/2;
		        if(hand<=m){
		            curr=next;
		            group++;
		        }
		        else break;}
		    sb.append(group).append("\n");
		}
      System.out.println(sb);
	}
}
