class Solution {
    public long sumXOR(int[] arr) {
        int n = arr.length;
        long sum = 0;

       
        for (int i = 0; i < 32; i++) {
            long countSet = 0;
            for (int num : arr) {
                if ((num & (1 << i)) != 0) {
                    countSet++;
                }
            }
            long countUnset = n - countSet;

            
            sum += countSet * countUnset * (1L << i);
        }

        return sum;
    }
}