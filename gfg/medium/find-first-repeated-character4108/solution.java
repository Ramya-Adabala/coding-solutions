class Solution {
    String firstRepChar(String s) {
        // code here
        boolean[] seen = new boolean[26];

        for (char c : s.toCharArray()) {
        int idx = c - 'a';
        if (seen[idx]) {
        return String.valueOf(c);
        }
        seen[idx] = true;
        }

        return "-1";
    }
}