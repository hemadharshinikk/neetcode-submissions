class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int l = 1, r = 0;
        for (int p : piles) r = Math.max(r, p);

        while (l < r) {
            int m = l + (r - l) / 2;
            long t = 0;

            for (int p : piles)
                t += (p - 1) / m + 1;

            if (t <= h) r = m;
            else l = m + 1;
        }
        return l;
    }
}