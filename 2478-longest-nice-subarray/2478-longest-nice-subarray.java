class Solution {
    public int longestNiceSubarray(int[] nums) {
        int numLen = nums.length;
        int preSum=0, len=0, result=1;

        for(int i=0;i<numLen;i++){
            int num = nums[i];

            while((preSum & num) != 0){
                if(i-len >=0){
                preSum -= nums[i-len];
                len--;}
                else{
                    break;
                }
            }
            preSum |= num;
            len++;

            result = Math.max(result, len);
        }

        return result;
    }
}