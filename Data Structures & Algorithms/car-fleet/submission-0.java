class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int n = position.length, c = 0;
        int[][] a = new int[n][2];

        for (int i = 0; i < n; i++) {
            a[i][0] = position[i];
            a[i][1] = speed[i];
        }

        java.util.Arrays.sort(a, (x, y) ->
            Integer.compare(y[0], x[0]));

        double m = 0;
        for (int[] x : a) {
            double t = (double) (target - x[0]) / x[1];
            if (t > m) {
                c++;
                m = t;
            }
        }
        return c;
    }
}