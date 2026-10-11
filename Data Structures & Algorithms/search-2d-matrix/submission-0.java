class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length, n = matrix[0].length;
        int l = 0, r = m * n - 1;

        while (l <= r) {
            int k = l + (r - l) / 2;
            int v = matrix[k / n][k % n];

            if (v == target) return true;
            if (v < target) l = k + 1;
            else r = k - 1;
        }
        return false;
    }
}