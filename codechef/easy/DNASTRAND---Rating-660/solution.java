import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();
            
            StringBuilder sComp = new StringBuilder();
            
            for (int i = 0; i < n; i++) {
                char ch = s.charAt(i);
                if (ch == 'A') {
                    sComp.append('T');
                } else if (ch == 'T') {
                    sComp.append('A');
                } else if (ch == 'C') {
                    sComp.append('G');
                } else if (ch == 'G') {
                    sComp.append('C');
                }
            }
            
            System.out.println(sComp.toString());
        }
    }
}