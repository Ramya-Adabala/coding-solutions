class Solution {
    public int getCount(int[] arr, int x, int y) {
        // code here
        int diff = 0;
        int p1 = -1;
        int p2 = -1;

        for(int i = 0 ; i < arr.length ; i++){

            if(arr[i] == x){

                p1 = i;
                break;
            }

        }

        for(int i = arr.length-1 ; i >= 0 ; i--){

            if(arr[i] == y){

                p2 = i;
                break;
            }
        }
        if(p1 == -1 || p2 == -1) return -1;
        diff = (p2 - p1) - 1;
        return diff;
    }
}