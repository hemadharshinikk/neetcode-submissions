class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        TreeMap<Integer, Integer> map = new TreeMap<>();
        int[] ans = new int[nums.length - k + 1];

        for (int i = 0; i < nums.length; i++) {
            // Current number add pannu
            int num = nums[i];
            map.put(num, map.getOrDefault(num, 0) + 1);

            // Window-ku veliya pona number remove pannu
            if (i >= k) {
                int old = nums[i - k];
                map.put(old, map.get(old) - 1);

                if (map.get(old) == 0) {
                    map.remove(old);
                }
            }

            // Window ready na maximum store pannu
            if (i >= k - 1) {
                ans[i - k + 1] = map.lastKey();
            }
        }

        return ans;
    }
}