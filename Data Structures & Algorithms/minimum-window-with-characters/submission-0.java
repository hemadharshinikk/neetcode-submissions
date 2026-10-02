class Solution {
    public String minWindow(String s, String t) {
        int[] count = new int[128];

        for (int i = 0; i < t.length(); i++) {
            count[t.charAt(i)]++;
        }

        int start = 0, need = t.length();
        String ans = "";

        for (int end = 0; end < s.length(); end++) {
            char ch = s.charAt(end);

            if (count[ch] > 0) {
                need--;
            }
            count[ch]--;

            while (need == 0) {
                if (ans.isEmpty() || end - start + 1 < ans.length()) {
                    ans = s.substring(start, end + 1);
                }

                char first = s.charAt(start);
                count[first]++;

                if (count[first] > 0) {
                    need++;
                }
                start++;
            }
        }
        return ans;
    }
}