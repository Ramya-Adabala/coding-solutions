import java.util.*;

class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        Map<String, Integer> count = new HashMap<>();
        for (String w : s1.split(" ")) {
            count.put(w, count.getOrDefault(w, 0) + 1);
        }
        for (String w : s2.split(" ")) {
            count.put(w, count.getOrDefault(w, 0) + 1);
        }

        List<String> ans = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : count.entrySet()) {
            if (entry.getValue() == 1) {
                ans.add(entry.getKey());
            }
        }
        return ans.toArray(new String[0]);
    }
}