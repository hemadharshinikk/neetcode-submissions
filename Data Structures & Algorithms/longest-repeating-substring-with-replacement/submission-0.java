class Solution {
    public int characterReplacement(String s, int k) {

        int[] freq = new int[26];
        int start = 0;
        int ans = 0;

        for (int i = 0; i < s.length(); i++) {

            freq[s.charAt(i) - 'A']++;

            int max = 0;
            for (int j = 0; j < 26; j++) {
                max = Math.max(max, freq[j]);
            }

            while ((i - start + 1) - max > k) {
                freq[s.charAt(start) - 'A']--;
                start++;

                max = 0;
                for (int j = 0; j < 26; j++) {
                    max = Math.max(max, freq[j]);
                }
            }

            ans = Math.max(ans, i - start + 1);
        }

        return ans;
    }
}