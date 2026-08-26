class Solution {
    public ArrayList<Integer> getTriangle(int[] arr) {
        // code here
    ArrayList<Integer> ans=new ArrayList();
     ArrayList<Integer> ans1=new ArrayList();
    for(int i=0;i<arr.length;i++){
        ans.add(arr[i]);
        ans1.add(arr[i]);
    }
    while(ans.size()>0){
        int size=ans.size();
     for(int i=0;i<size-1;i++){
         ans.add(ans.get(i)+ans.get(i+1));
     }
      ans.subList(0,size).clear();
       ans1.addAll(0,ans);
    }
    return ans1;
    }
}