

class Solution {
    public static String missingPanagram(String s) {
        // code here
        HashSet<Character> set = new HashSet<>();
        StringBuilder sb = new StringBuilder();

        for(char ch = 'a' ; ch <= 'z' ; ch++){

            set.add(ch);
        }

        for(int i = 0 ; i < s.length() ; i++){

            char ch = Character.toLowerCase(s.charAt(i));

            set.remove(ch);
        }

        for(char ch : set){

            sb.append(ch);
        }
        if(sb.length() == 0) return "-1";
        return sb.toString();


    }
}