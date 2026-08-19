import java.util.Scanner;
import java.math.BigInteger;

class Codechef
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) return;
        int t = sc.nextInt();
        
        while (t-- > 0) {
            int n = sc.nextInt();
            BigInteger fact = BigInteger.ONE;
            
            for (int i = 1; i <= n; i++) {
                fact = fact.multiply(BigInteger.valueOf(i));
            }
            
            System.out.println(fact);
        }
        sc.close();
    }
}