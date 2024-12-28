class Solution {
    public int lengthOfLongestSubstring(String s) {
        int r=0;
        int l=0;
        int n=s.length();
        int res=0;
        Map<Character,Integer> m = new HashMap<>();
        while(r<n)
        {
            if(m.containsKey(s.charAt(r)))
            {
                 l= Math.max(l,m.get(s.charAt(r))+1);
            }
            m.put(s.charAt(r),r);
            res=Math.max(res,r-l+1);
            r++;
        }
        return res;
    }
}