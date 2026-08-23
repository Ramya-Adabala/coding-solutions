class Solution {
    public int majorityElement(int[] nums) {
        int no=nums.length;
        Map<Integer,Integer> obj=new LinkedHashMap<>();
        for(int n:nums){
            obj.put(n,obj.getOrDefault(n,0)+1);

        }
        
        for (int nu:nums){
        if(obj.get(nu)>Math.floor(no/2)){
       
        return nu;
    }}
    return -1;
    }
}