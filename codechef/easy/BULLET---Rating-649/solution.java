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
		    int x=sc.nextInt();
		    int rem=x%3;
		    if (rem == 0) {
                    System.out.println("NORMAL");
                } else if (rem == 1) {
                    System.out.println("HUGE");
                } else {
                    System.out.println("SMALL");
                }
		}

	}
}
