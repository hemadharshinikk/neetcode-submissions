class Solution {
    public int largestRectangleArea(int[] h) {
        int n = h.length, t = -1, ans = 0;
        int[] s = new int[n];

        for (int i = 0; i <= n; i++) {
            int x = i == n ? 0 : h[i];

            while (t >= 0 && h[s[t]] > x) {
                int a = h[s[t--]];
                int w = t < 0 ? i : i - s[t] - 1;
                ans = Math.max(ans, a * w);
            }

            if (i < n) s[++t] = i;
        }
        return ans;
    }
}