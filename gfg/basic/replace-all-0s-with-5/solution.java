/*Complete the function below*/
class Solution {
    public static int convertFive(int n) {
        // add code here.
        String s=String.valueOf(n).replace('0','5');
        int st=Integer.parseInt(s);
        return st;
    }
}