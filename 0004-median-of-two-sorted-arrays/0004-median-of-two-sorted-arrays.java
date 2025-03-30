class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        List<Integer> n = new ArrayList<>();
        int x=0,y=0;
        int a=nums1.length,b=nums2.length;
        while(x<a && y<b)
        {
            if(nums1[x]<nums2[y])
            {
                n.add(nums1[x]);
                x++;
            }
            else
            {
                n.add(nums2[y]);
                y++;
            }
        }
        while(x<a) 
        {
            n.add(nums1[x]);
            x++;
        }
        while(y<b)
        {
            n.add(nums2[y]);
            y++;
        }
        int middle = n.size()/2;
        if(n.size() % 2!=0)
        {
            return n.get(middle);
        }
        else
        {
            return (n.get(middle-1)+ n.get(middle))/ 2.0;
        }
    }
}