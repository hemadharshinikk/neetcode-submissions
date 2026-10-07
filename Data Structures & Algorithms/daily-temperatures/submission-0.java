class Solution {
    public int[] dailyTemperatures(int[] t) {
        int n = t.length, k = -1;
        int[] a = new int[n], s = new int[n];

        for (int i = 0; i < n; i++) {
            while (k >= 0 && t[i] > t[s[k]]) {
                int j = s[k--];
                a[j] = i - j;
            }
            s[++k] = i;
        }
        return a;
    }
}