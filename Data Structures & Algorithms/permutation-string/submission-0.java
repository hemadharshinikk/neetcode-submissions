class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int n=s1.length();
        char[] first=s1.toCharArray();
        Arrays.sort(first);
        for(int i=0;i<=s2.length()-n;i++)
        {
            String sec= s2.substring(i,i+n);
            char[] second=sec.toCharArray();
            Arrays.sort(second);
            if(Arrays.equals(first,second))
            return true;
        }
        return false;
    }
}