class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character>set=new HashSet<>();
        int st=0;
        int maxi=0;
        for(int i=0;i<s.length();i++)
        {
            while(set.contains(s.charAt(i)))
            {
                set.remove(s.charAt(st));
                //set.add(s.charAt(i));
                st++;

            }
            set.add(s.charAt(i));
            maxi=Math.max(maxi,i-st+1);
        }
        return maxi;
    }
}