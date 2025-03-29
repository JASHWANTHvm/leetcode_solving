class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> m = new HashMap<>();
        int n = nums.length;
        int arr[] = new int[2];
        for(int i=0;i<n;i++)
        {
            if(m.containsKey(target-nums[i]))
            {
                arr[1]=i;
                arr[0]=m.get(target-nums[i]);
            }
            else
            {
                m.put(nums[i],i);
            }
        }
        return arr;
    }
}