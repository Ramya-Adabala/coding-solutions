// User function Template for Java
class Solution {
    public static int gcd(int a, int b) {

        // code here to calculate and return gcd of a and b
        while(a!=b){
            if(a>b)
            a=a-b;
            else
            b=b-a;
        }
        return a;
    }
}