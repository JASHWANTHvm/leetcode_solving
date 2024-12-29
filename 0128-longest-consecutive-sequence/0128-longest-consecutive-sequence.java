class Solution {
    public int longestConsecutive(int[] nums) {
        int n = nums.length;
        Set<Integer> s = new HashSet<>();
        int c=0;
        for (int num : nums)
        {
            s.add(num);
        }
        for(int num : nums)
        {
            if(!s.contains(num-1))
            {
                int count=1;
                int currentnum=num;
                while(s.contains(currentnum+1))
                {
                    currentnum+=1;
                    count+=1;
                }
                c=Math.max(c,count);
            }
        }
        return c;
    }
}                                                                                                                                                                                               