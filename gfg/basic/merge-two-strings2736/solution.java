class Solution {
    String merge(String s1, String s2) {
        // code here
        StringBuilder sb=new StringBuilder();
        int m=s1.length();
        int n=s2.length();
        int i=0;int j=0;
        while(i<m && j<n){
            sb.append(s1.charAt(i));
            sb.append(s2.charAt(j));
            i++;j++;
        }
        while(i<m){
            sb.append(s1.charAt(i));
            i++;
        }
        while(j<n){
            sb.append(s2.charAt(j));
            j++;
        }
        return sb.toString();
    }
}