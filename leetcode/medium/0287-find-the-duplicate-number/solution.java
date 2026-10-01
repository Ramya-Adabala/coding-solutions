class Solution {
    public int findDuplicate(int[] nums) {
        Map<Integer,Integer> obj=new LinkedHashMap<>();
        for(int n:nums){
            obj.put(n,obj.getOrDefault(n,0)+1);
}
       for(int n:nums){
        if(obj.get(n)>=2)
        return n;
       }
       return -1;
    }
}