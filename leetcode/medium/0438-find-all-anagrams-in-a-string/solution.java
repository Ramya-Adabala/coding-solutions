class Solution {
    public List<Integer> findAnagrams(String s, String p) {
         List<Integer> res = new ArrayList<>();
        int n=s.length(),m=p.length();
        if (n < m) {
            return res;
        }
        
        int[] c1 = new int[26];
        int[]c2 = new int[26];
        
        for (int i = 0; i < m; i++) {
            c1[p.charAt(i) - 'a']++;
        }
        
        for (int i = 0; i < m; i++) {
           c2[s.charAt(i) - 'a']++;
        }
        
        
        boolean isMatch = true;
        for (int j = 0; j < 26; j++) {
            if (c1[j] != c2[j]) {
                isMatch = false;
                break;
            }
        }
        if (isMatch) {
            res.add(0);
        }
        
        for (int i = m; i < n; i++) {
           c2[s.charAt(i) - 'a']++;
            c2[s.charAt(i - m) - 'a']--;
            
            isMatch = true;
            for (int j = 0; j < 26; j++) {
                if (c1[j] != c2[j]) {
                    isMatch = false;
                    break;
                }
            }
            if (isMatch) {
                res.add(i - m + 1);
            }
        }
        
        return res;
        
    }
}