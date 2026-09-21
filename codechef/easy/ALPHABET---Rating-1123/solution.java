import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
        
        String s = sc.nextLine();
        HashSet<Character> knownChars = new HashSet<>(); 
        for (int i = 0; i < s.length(); i++) {
            knownChars.add(s.charAt(i));
        }
        
        int t = sc.nextInt();
        sc.nextLine();
        
        while (t-- > 0) {
            String word = sc.nextLine();
            boolean canRead = true;
            
            for (int i = 0; i < word.length(); i++) {
                if (!knownChars.contains(word.charAt(i))) {
                    canRead = false;
                    break;
                }
            }
            
            if (canRead) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }

	}
}
