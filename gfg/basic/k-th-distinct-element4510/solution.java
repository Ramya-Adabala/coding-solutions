// User function Template for Java

class Solution {
    public int kthDistinct(int[] nums, int k) {
        // Code here
         Map<Integer,Integer> obj=new LinkedHashMap<>();
    for (int num : nums) {
            obj.put(num, obj.getOrDefault(num, 0) + 1);
        }

        for (int n : nums) {
            if (obj.get(n) == 1)
            { k--;
            
              if(k==0)  return n ;
            }
        }

        return -1;
    }
}