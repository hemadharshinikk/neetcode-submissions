class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer>set = new HashSet<>();
        for(int i=0;i<nums.length;i++)
        {
            set.add(nums[i]);
        }
       int max=0;
       for(int i=0;i<nums.length;i++)
       {
        int n=nums[i];
        if(!set.contains(n-1))
        {
            int c=0;
            while(set.contains(n))
            {
                c++;
                n++;
            }
            max=Math.max(max,c);
        }
       }
       return max;
    }
}