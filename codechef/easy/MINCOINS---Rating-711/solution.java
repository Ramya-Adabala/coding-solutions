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
		int five=5,ten=10;
		while(t-->0){
		    int x=sc.nextInt();
		    if(x%10==0) System.out.println(x/10);
		    else if(x%10==5){
		        int s=(x/10)+1;
		        System.out.println(s);
		    }
		    else System.out.println(-1);

	}}
}
