class Solution {
    String findSum(String s1, String s2) {
        // code here
        BigInteger b1=new BigInteger(s1);
        BigInteger b2=new BigInteger(s2);
        BigInteger res=b1.add(b2);
        return res.toString();
    }
}