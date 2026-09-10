import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0) {
            int x = sc.nextInt();
            String s = sc.next(); // Using sc.next() avoids newline buffering issues
            
            int carlsenPoints = 0;
            int chefPoints = 0;
            
            // Calculate points for each game
            for(int i = 0; i < 14; i++) {
                char winner = s.charAt(i);
                if(winner == 'C') {
                    carlsenPoints += 2;
                } else if(winner == 'N') {
                    chefPoints += 2;
                } else {
                    // It's a draw ('D')
                    carlsenPoints += 1;
                    chefPoints += 1;
                }
            }
            
            // Determine prize money based on points
            if(carlsenPoints > chefPoints) {
                System.out.println(60 * x);
            } else if(carlsenPoints < chefPoints) {
                System.out.println(40 * x);
            } else {
                // Points are tied, Carlsen wins as defending champion
                System.out.println(55 * x);
            }
        }
        sc.close();
    }
}