class Solution {
    public int[] findDegrees(int[][] matrix) {
        int degree[]=new int[matrix.length];
        int n=matrix.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<matrix[i].length;j++){
                if(matrix[i][j]==1) degree[j]++;
            }
        }
        return degree;
    }
}