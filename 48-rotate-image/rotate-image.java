class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        int[][] output = new int[n][n];
        int or = 0, oc = 0;

        for (int ic = 0; ic < n; ic++) {
            for (int ir = n - 1; ir >= 0; ir--) {
                output[or][oc] = matrix[ir][ic];
                oc++;
                if (oc == n) {
                    oc = 0;
                    or++;
                }
            }
        }

        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                matrix[i][j] = output[i][j];
    }
}