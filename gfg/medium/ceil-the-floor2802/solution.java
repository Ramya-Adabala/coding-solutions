class Solution {
    public int[] getFloorAndCeil(int x, int[] arr) {
        // code here
        int f=-1;
              int c=-1;
              for(int v:arr){
                  if(v<=x && (f==-1||v>f))f=v;
                  if(v>=x && (c==-1||v<c))c=v;

              }
              return new int[]{f,c};

          
    }
}
