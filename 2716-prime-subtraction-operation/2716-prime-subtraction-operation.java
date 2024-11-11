class Solution {
    public boolean primeSubOperation(int[] nums) {
        int len = nums.length;
        for(int i = len-1;i > 0;i--){
            if(nums[i] <= nums[i-1]){
                int diff = nums[i-1]-nums[i];
                diff++;
                while(!checkPrime(diff)){
                    diff++;
                }
                if(nums[i-1]-diff <= 0){
                    return false;
                }
                nums[i-1] -= diff;
            }
        }
        return true;
    }
    public boolean checkPrime(int no){
        if (no <= 1)
            return false;

        for (int i = 2; i <= no / 2; i++)
            if (no % i == 0)
                return false;

        return true;
    }
}