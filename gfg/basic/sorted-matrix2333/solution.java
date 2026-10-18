import java.util.Arrays;

class Solution {
    int[][] sortedMatrix(int mat[][]) {
        int n = mat.length;
        int arr[] = new int[n * n];

        int k = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[k++] = mat[i][j];
            }
        }

        // Sort the flattened 1D array
        Arrays.sort(arr);

        k = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                mat[i][j] = arr[k++];
            }
        }

        return mat;
    }
}