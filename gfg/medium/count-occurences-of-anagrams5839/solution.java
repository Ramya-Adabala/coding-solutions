class Solution {
    int search(String pat, String txt) {
        int n = txt.length();  
        int m = pat.length(); 
        if (m > n) return 0;  
        int[] c1 = new int[26];
        int[] c2 = new int[26];
        for (int i = 0; i < m; i++) {
            c2[txt.charAt(i) - 'a']++;
            c1[pat.charAt(i) - 'a']++;  
        }
         int c = 0;
        if (Arrays.equals(c1, c2)) c++; 
     for (int i = m; i < n; i++) {
            
            c2[txt.charAt(i) - 'a']++;
            c2[txt.charAt(i - m) - 'a']--;
            
            if (Arrays.equals(c1, c2)) c++;
        }
        return c;
    }
}
